SUMMARY = "Sampling-rate conversion program"
DESCRIPTION = "The resample program is a high-quality resampling program. For example, \
it can be used to convert the sampling rate from 48 kHz (used by DAT \
machines) to 44.1 kHz (the standard sampling rate for Compact Discs)."
LICENSE = "LGPL-2.1+"

PV = "1.8.1"

RPM_NAME = "resample-1.8.1-20.26.aarch64.rpm"
RPM_HASH = "e537870b7c729effcacc0cc904b9be6b6cee79e65acb4cebd8b8e8bf4ec7bfefea33af22f4efb6192adb52aaee0fd7975768fd28a1d4e19b5c33646c14c63393"

RPROVIDES:${PN} += "resample \
resample(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
