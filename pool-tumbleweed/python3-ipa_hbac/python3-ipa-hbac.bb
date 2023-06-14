SUMMARY = "Python bindings for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "The python-ipa_hbac package contains the bindings so that libipa_hbac \
can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python3-ipa_hbac-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "e67aa4a9c285d6d50ee21e1d1e79b55b84291fbbdabbd4ae233b009ce452b54b36dc39a45e28cd0eb521adb24f129c16571793ee2c71780853aa57ea8c9f99a3"

RPROVIDES:${PN} += "python3-ipa-hbac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libipa-hbac.so.0 \
python-abi \
python3"

inherit rpm
