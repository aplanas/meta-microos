SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python311-fb-re2-1.0.7-3.1.aarch64.rpm"
RPM_HASH = "ac28d63f196bc6b20408687d31c10cb2c6793284861f27865dc10136e15ef27fa31706d8e7eca09f3a4a3b45cb4eb04cd77dd56cb77db6f54e9ceff6c55b5b88"

RPROVIDES:${PN} += "python3-fb-re2 \
python3.11dist-fb-re2 \
python311-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
