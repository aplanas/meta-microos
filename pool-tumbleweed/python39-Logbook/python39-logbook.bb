SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-Logbook-1.5.3-4.1.aarch64.rpm"
RPM_HASH = "3f361cdf400df23fd11a1f39d1a83f4f100cfde60e1ff0c78f84865c7f075c1b5cf6bc8b84909d76f22cc187f4d51534e8bfbc8914b94cfc8266ba80fadab5be"

RPROVIDES:${PN} += "python3.9dist-logbook \
python39-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
