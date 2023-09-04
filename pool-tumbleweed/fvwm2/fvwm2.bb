SUMMARY = "The F Virtual Window Manager"
DESCRIPTION = "FVWM is a virtual desktop window manager for the X Window System. \
 \
FVWM is intended to have a small memory footprint but a rich feature \
set, to be extremely customizable and extendible, and to be very \
compatible with the Motif Window Manager (mwm)."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "fvwm2-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "0b2af0473219ca816cbcc9a03765069efe14699cd97d330e6374db67defdd2ef081e1f4b71993b1142a36f0889fcc54932e973a4fbbbeb61e2811b08ca718e33"

RPROVIDES:${PN} += "config-fvwm2 \
fvwm \
fvwm2 \
fvwmicns \
perl-FVWM--Commands \
perl-FVWM--Constants \
perl-FVWM--Event \
perl-FVWM--EventNames \
perl-FVWM--Module \
perl-FVWM--Module--Terminal \
perl-FVWM--Module--Tk \
perl-FVWM--Module--Toolkit \
perl-FVWM--Tracker \
perl-FVWM--Tracker--Colorsets \
perl-FVWM--Tracker--GlobalConfig \
perl-FVWM--Tracker--ModuleConfig \
perl-FVWM--Tracker--PageInfo \
perl-FVWM--Tracker--Scheduler \
perl-FVWM--Tracker--WindowList \
perl-FVWM--Window \
perl-General--FileSystem \
perl-General--Parse \
windowmanager \
xpmroot"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
desktop-data \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
libreadline.so.8 \
librsvg-2.so.2 \
libstroke.so.0 \
mktemp \
update-alternatives \
wallpaper-branding \
xdg-menu \
xli"

inherit rpm
