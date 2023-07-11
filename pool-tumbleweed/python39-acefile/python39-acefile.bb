SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python39-acefile-0.6.12-3.18.aarch64.rpm"
RPM_HASH = "7fa7e0cfe624ffa791f020a1de25feb6634ca992a2f9a57550fa456e97ab7ac590e8eab2ecc1b37b7a7bc0d3b86e3c31ca104831492ee94fee6f0f38cb3cdc40"

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
