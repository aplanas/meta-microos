SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python311-unicodedata2-15.0.0-1.6.aarch64.rpm"
RPM_HASH = "9c3a19d553288f9467d5159dfb9913761fb7d9d0d7c998d2622f38bcd769e78b73dde77a962e4387ccf7ef99e0f3f4cdd5def0b919f27b1cf94b37ada6f7d690"

RPROVIDES:${PN} += "python3-unicodedata2 \
python3.11dist-unicodedata2 \
python311-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
