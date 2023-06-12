SUMMARY = "Tools to use the Bauer stereophonic-to-binaural DSP"
DESCRIPTION = "Tools (bs2bconvert and bs2bstream) to use the Bauer stereophonic-to-binaural \
DSP."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "bs2b-tools-3.1.0-13.3.aarch64.rpm"
RPM_HASH = "554cebe3e06e60e3f191c5b738e4329757bfd22fde0e313f4114415c959e778300300fb90fe1f12ae134753225ffb3ddc7cf2dc6b69d17114dad9e5b47a939fc"

RPROVIDES:${PN} += "bs2b-tools \
bs2b-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbs2b.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
