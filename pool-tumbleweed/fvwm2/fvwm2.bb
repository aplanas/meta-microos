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

RPROVIDES:${PN} += "config(fvwm2) \
fvwm \
fvwm2 \
fvwm2(aarch-64) \
fvwmicns \
perl(FVWM::Commands) \
perl(FVWM::Constants) \
perl(FVWM::Event) \
perl(FVWM::EventNames) \
perl(FVWM::Module) \
perl(FVWM::Module::Terminal) \
perl(FVWM::Module::Tk) \
perl(FVWM::Module::Toolkit) \
perl(FVWM::Tracker) \
perl(FVWM::Tracker::Colorsets) \
perl(FVWM::Tracker::GlobalConfig) \
perl(FVWM::Tracker::ModuleConfig) \
perl(FVWM::Tracker::PageInfo) \
perl(FVWM::Tracker::Scheduler) \
perl(FVWM::Tracker::WindowList) \
perl(FVWM::Window) \
perl(FvwmCommand) \
perl(General::FileSystem) \
perl(General::Parse) \
windowmanager \
xpmroot"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
desktop-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXpm.so.4()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libreadline.so.8()(64bit) \
librsvg-2.so.2()(64bit) \
libstroke.so.0()(64bit) \
mktemp \
update-alternatives \
wallpaper-branding \
xdg-menu \
xli"

inherit rpm
