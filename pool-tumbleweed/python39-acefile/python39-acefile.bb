SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python39-acefile-0.6.12-3.16.aarch64.rpm"
RPM_HASH = "088bc3e4ed4e835d0df2b4db8bb44fb06537ff1cc32a44557b8276bdd28eea6fbd40fa3b688cb9ec1e857c2ada1c83530cd6bfde0d4d2d8b734d67915ebb49b4"

RPROVIDES:${PN} += "python3.9dist-acefile \
python39-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
