SUMMARY = "Python bindings for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "The python-ipa_hbac package contains the bindings so that libipa_hbac \
can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "python3-ipa_hbac-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "4e232f99d5a11b1124f5ab742a985298521cea71cf89b25c462f9af0ac6ce425c0391b9385af4a71d512f0d934b19f09daad00a3f0aab2586301b7655bcf3ee2"

RPROVIDES:${PN} += "python3-ipa-hbac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libipa-hbac.so.0 \
python-abi \
python3"

inherit rpm
