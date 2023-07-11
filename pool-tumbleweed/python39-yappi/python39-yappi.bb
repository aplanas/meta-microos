SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-yappi-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "4ec77bf0fbd741734722f4826ad10c5dc1a2a70474eb89c3c05cd14ed82853a620fe76144b7d00b8ef9dbf47dfd431d621c3ef6b5f71d20439d45e2518243b97"

RPROVIDES:${PN} += "python3.9dist-yappi \
python39-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
