SUMMARY = "Rxvt X Terminal with Unicode Support"
DESCRIPTION = "rxvt-unicode is a clone of the well-known terminal emulator rxvt, \
modified to store text in Unicode (either UCS-2 or UCS-4) and to use \
locale-correct input and output. It also supports mixing multiple fonts \
at the same time, including Xft fonts."
LICENSE = "GPL-3.0-or-later"

PV = "9.30"

RPM_NAME = "rxvt-unicode-9.30-2.4.aarch64.rpm"
RPM_HASH = "5bf0fdc94ccd7eace4d6cbe01cc56dab0f678d8189429d2cbd40a26d995fcbbac99bf85e4c7d8ffa58d724f7d9e96bb986f5831076948bff38aae9a9ae58adc4"

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
