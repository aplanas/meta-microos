SUMMARY = "Rxvt X Terminal with Unicode Support"
DESCRIPTION = "rxvt-unicode is a clone of the well-known terminal emulator rxvt, \
modified to store text in Unicode (either UCS-2 or UCS-4) and to use \
locale-correct input and output. It also supports mixing multiple fonts \
at the same time, including Xft fonts."
LICENSE = "GPL-3.0-or-later"

PV = "9.30"

RPM_NAME = "rxvt-unicode-9.30-2.3.aarch64.rpm"
RPM_HASH = "4e81f3de389d0fe8640d680ebf00e0c0ede98d96d743ee101e5746ba01f471aa9cd1dcdc668eadccb0c11304f1c05257100363a4fccaae4836491f824f75ad81"

RPROVIDES:${PN} += "application() \
application(rxvt-unicode-256color.desktop) \
application(rxvt-unicode.desktop) \
locale(xorg-x11:ja;ko;zh) \
perl(urxvt) \
perl(urxvt::anyevent) \
perl(urxvt::popup) \
perl(urxvt::term) \
perl(urxvt::term::extension) \
perl(urxvt::watcher) \
rxvt-unicode \
rxvt-unicode(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libperl.so()(64bit) \
libptytty.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
perl \
terminfo-base"

inherit rpm
