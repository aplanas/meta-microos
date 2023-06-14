SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-yappi-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "7b1c7eaf55fc36b1fae2a9f6cc49b4bb2956600c09dd99aa034336f54fe0f17cd79a6075c9ba2bea4ec4ec402c6184e52c8556f883a0f4d11d196dbe25ea87e4"

RPROVIDES:${PN} += "python3-yappi \
python3.10dist-yappi \
python310-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
