SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-yappi-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "17af702b125d2a028bdc5ec22bf463710eb5c289ceb09092e2f9f813855502e18f26ba4442deff5900f136c38a906dd80b0f575f4ca786ec6d7a628a3425ac1d"

RPROVIDES:${PN} += "python3.9dist(yappi) \
python39-yappi \
python39-yappi(aarch-64) \
python3dist(yappi)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
