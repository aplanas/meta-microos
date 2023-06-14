SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python39-fb-re2-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "581cc00fdaaf3da88baf5dc9bcc1a038e867ee3c8f5086d7761ef296a9e581ba8fe58a04c1f756f1fff726945cfed51afc04165f778e1276ee0eaa8c53aba4f0"

RPROVIDES:${PN} += "python3.9dist-fb-re2 \
python39-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.10 \
libstdc++.so.6 \
python-abi"

inherit rpm
