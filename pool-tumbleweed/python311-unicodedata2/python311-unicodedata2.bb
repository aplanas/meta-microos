SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python311-unicodedata2-15.0.0-1.4.aarch64.rpm"
RPM_HASH = "f4642649b6b03efea476be611e6db62a11997d5c99c187fbb8504b13305417cdeb97ebffdadcf698c1d8c26f0836068906b0e5e6c133b3a47f48010e0b7f759e"

RPROVIDES:${PN} += "python3.11dist-unicodedata2 \
python311-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
