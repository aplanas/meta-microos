SUMMARY = "Kerberos5 Credential Cache Collection utilities"
DESCRIPTION = "Kerberos5 Credential Cache Collection utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "python310-CCColUtils-1.5-1.15.aarch64.rpm"
RPM_HASH = "e5d584ccd9a466d9182d2d1f2b4c7da4f5bc60f0e889ba7877425a9794356d6495951e6c02be3c08092d39e35e86665437cfc2c0d4a776ad23012c67f25add8e"

RPROVIDES:${PN} += "python3.10dist-cccolutils \
python310-CCColUtils \
python3dist-cccolutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkrb5.so.3 \
python-abi"

inherit rpm
