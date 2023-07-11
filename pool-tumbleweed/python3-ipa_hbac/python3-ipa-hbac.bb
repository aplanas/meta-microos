SUMMARY = "Python bindings for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "The python-ipa_hbac package contains the bindings so that libipa_hbac \
can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python3-ipa_hbac-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "6123715ea23f5d24cfe0db63a73faf190f78ce280e9765d244120752d8a0dc60f67851ffe6ed3a4a0ff6054cc99d73a6bba6cb1fdcbde1548ce1dc3dfc63097f"

RPROVIDES:${PN} += "python3-ipa-hbac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libipa-hbac.so.0 \
python-abi \
python3"

inherit rpm
