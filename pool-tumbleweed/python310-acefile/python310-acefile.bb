SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python310-acefile-0.6.12-3.18.aarch64.rpm"
RPM_HASH = "3abd25852d48030a9d2abf324803e6604af85e51f59a57897d1c1b47d1992a05d48ff337720e1536a4d4ed9883db5df406df09b17828ff08972fdd9960bc6c03"

RPROVIDES:${PN} += "python3.10dist-acefile \
python310-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
