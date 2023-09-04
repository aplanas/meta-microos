SUMMARY = "Rxvt X Terminal with Unicode Support"
DESCRIPTION = "rxvt-unicode is a clone of the well-known terminal emulator rxvt, \
modified to store text in Unicode (either UCS-2 or UCS-4) and to use \
locale-correct input and output. It also supports mixing multiple fonts \
at the same time, including Xft fonts."
LICENSE = "GPL-3.0-or-later"

PV = "9.30"

RPM_NAME = "rxvt-unicode-9.30-2.5.aarch64.rpm"
RPM_HASH = "34b1457eb959bd9748c7001640df20a44d9fb1073aa78021cea65bfc02884c7de4bd09065d177212786162d113af75cac90c43d4b82255f5b1799eeb349cdebf"

RPROVIDES:${PN} += "locale-xorg-x11-ja;ko;zh \
perl-urxvt \
perl-urxvt--anyevent \
perl-urxvt--popup \
perl-urxvt--term \
perl-urxvt--term--extension \
perl-urxvt--watcher \
rxvt-unicode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libperl.so \
libptytty.so.0 \
libstartup-notification-1.so.0 \
perl \
terminfo-base"

inherit rpm
