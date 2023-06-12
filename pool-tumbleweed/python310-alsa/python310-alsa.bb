SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python310-alsa-1.2.7-2.4.aarch64.rpm"
RPM_HASH = "18567981871d2845628de1c29d9fc9b579a435a367764b8d15036d88af2652069d66eca1cf248d4ae9544ab4d6f038b60c6a441e6952b7edd44593863605e86b"

RPROVIDES:${PN} += "pyalsa \
python3-alsa \
python3.10dist(pyalsa) \
python310-alsa \
python310-alsa(aarch-64) \
python3dist(pyalsa)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.3)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
