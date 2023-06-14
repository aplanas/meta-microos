SUMMARY = "The F Virtual Window Manager"
DESCRIPTION = "FVWM is a virtual desktop window manager for the X Window System. \
 \
FVWM is intended to have a small memory footprint but a rich feature \
set, to be extremely customizable and extendible, and to be very \
compatible with the Motif Window Manager (mwm)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.9"

RPM_NAME = "fvwm2-2.6.9-4.1.aarch64.rpm"
RPM_HASH = "f53bdd4954fc4c25981236f467177e2b45a654e2517699d39c99305f53f8ef8fcca92359c5da616d6dc47aee921f298df5d8dd069969f6cf8379adad482eb924"

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

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
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
