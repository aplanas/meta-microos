SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python310-patiencediff-0.2.12-1.6.aarch64.rpm"
RPM_HASH = "e9ccd29544b614c570111233a0296b7cd68a2198b8ae6de4cac278c5e4afbc01240d77e5f64f2bacbb6633748e8a026b200b9cf58458c1bf1be407a21d0d85c6"

RPROVIDES:${PN} += "python3.10dist-patiencediff \
python310-patiencediff \
python3dist-patiencediff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
