SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-yappi-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "5c457e64c2611af1e4e66b8e617d53aa6aa61df70aa45d7b2c151de148d8a43ae9d502017c4eb07e161ba3697e75a1296260ac2751162e1320c4305d25738701"

RPROVIDES:${PN} += "python3.10dist-yappi \
python310-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
