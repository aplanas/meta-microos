SUMMARY = "The F Virtual Window Manager"
DESCRIPTION = "FVWM is a virtual desktop window manager for the X Window System. \
 \
FVWM is intended to have a small memory footprint but a rich feature \
set, to be extremely customizable and extendible, and to be very \
compatible with the Motif Window Manager (mwm)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.9"

RPM_NAME = "fvwm2-2.6.9-4.2.aarch64.rpm"
RPM_HASH = "a187b5a64c65517e5e3ffd872e431dd83b04edd62ee017ba859c1d9f45092d0dcf6225fa8c7a4aa97c40c84609d77ed2f371df49de116f1df9c31901b3a6eeff"

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
perl-FvwmCommand \
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
