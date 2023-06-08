SUMMARY = "Daemon for audio calls"
DESCRIPTION = "A daemon for audio calls."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.4"

RPM_NAME = "callaudiod-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "e3c7cce7722559ce778aebe51279aab380445144ae168501eebe5384ce16a3ab613a3b1a0a5ecce965453680cc3d6e303702e70420a27ee9aba9742f27830e09"

RPROVIDES:${PN} += "callaudiod callaudiod(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcallaudio-0.1.so.0()(64bit) libcallaudio-0.1.so.0(LIBCALLAUDIO_0_0_0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpulse-mainloop-glib.so.0()(64bit) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
