SUMMARY = "SDR radio receiver"
DESCRIPTION = "The software for bladeRF USB 3.0 Superspeed Software Defined Radio."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-2023.02-16.3.aarch64.rpm"
RPM_HASH = "1affced5449098b7cb8270019233a3ee8ca06b0ffd7483a7d080e3d00e6517a5c8cf289bbde594be7ad8773f5e98e22bdef78e48f8f716b6b297d5540bf00baa"

RPROVIDES:${PN} += "bladeRF \
bladeRF(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbladeRF.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libtecla_r.so.1()(64bit) \
libtecla_r.so.1(tecla_1.2)(64bit) \
libtecla_r.so.1(tecla_1.4)(64bit) \
libtecla_r.so.1(tecla_l.5)(64bit)"

inherit rpm
