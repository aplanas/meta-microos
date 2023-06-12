SUMMARY = "Linear/longitudinal timecode library"
DESCRIPTION = "Linear (or Longitudinal) Timecode (LTC) is an encoding of SMPTE timecode \
data as a Manchester-Biphase encoded audio signal. The audio signal is \
commonly recorded on a VTR track or other storage media. \
 \
libltc provides functionality to encode and decode LTC audio from/to SMPTE \
or EBU timecode, including SMPTE date support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "libltc11-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "897401a39e8c17f2a815cd52ba52c63e2f3bd4a25b91ebdbba89846e47c8a3352ca67aeaae6da603e1de2e19484960872db3664b98c771223ab061c75ef4fe37"

RPROVIDES:${PN} += "libltc.so.11()(64bit) \
libltc11 \
libltc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
