SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python310-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "6d33bdc97a8072043897b04705f1e8c419a0393edfe910d34bd6a1cc994224e9f0553164d56fd66357deddf6776ee66b946d6a1e0091683ca8ba47b0fa7c8bbd"

RPROVIDES:${PN} += "python3-pyo \
python3.10dist(pyo) \
python310-pyo \
python310-pyo(aarch-64) \
python3dist(pyo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit) \
libportmidi.so.2()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
python(abi)"

inherit rpm
