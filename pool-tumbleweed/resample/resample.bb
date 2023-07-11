SUMMARY = "Sampling-rate conversion program"
DESCRIPTION = "The resample program is a high-quality resampling program. For example, \
it can be used to convert the sampling rate from 48 kHz (used by DAT \
machines) to 44.1 kHz (the standard sampling rate for Compact Discs)."
LICENSE = "LGPL-2.1+"

PV = "1.8.1"

RPM_NAME = "resample-1.8.1-20.27.aarch64.rpm"
RPM_HASH = "2494cdaf1a8ffc9a4740f4061f4c059e1d0e8f504c6b6e8e2d032fea10a2447834e86b46df50282b7381179abf4baeb37978eb46e5ac0697fc132e68d4ffae79"

RPROVIDES:${PN} += "resample"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
