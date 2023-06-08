SUMMARY = "Not so Common Desktop Environment (NsCDE)"
DESCRIPTION = "Visually, NsCDE mimics CDE, the well known Common Desktop Environment of \
many commercial UNIX systems of the nineties. It supports CDE backdrops and \
palettes with FVWM colorsets and has a theme generator for Xt, Xaw, Motif, \
GTK2, GTK3, Qt4 and Qt5. \
 \
Integrating all these bits and pieces, the user gets a retro visual experience \
across almost all X11 applications. Enriched with a bunch of powerful \
FVWM concepts and functions, modern applications and font rendering, \
NsCDE acts as a link between classic CDE look and a fast and \
extensible environment, well suited for modern day computing."
LICENSE = "GPL-3.0-only"

PV = "2.2"

RPM_NAME = "NsCDE-2.2-2.3.aarch64.rpm"
RPM_HASH = "608c7b2a23001270dc81b3248f0f757dbc5d47c9fc4ec157abfde6ed82cbb1df9e9dedc66b45413e6d53a9911228f82e28bdb2ce02728c945a165f8152021c31"

RPROVIDES:${PN} += "NsCDE NsCDE(aarch-64) application() application(nscde-appmgr.desktop) application(nscde-calculator.desktop) application(nscde-docsbrowser.desktop) application(nscde-editor.desktop) application(nscde-exec.desktop) application(nscde-filemgr.desktop) application(nscde-fvwmconsole.desktop) application(nscde-gwm.desktop) application(nscde-mailreader.desktop) application(nscde-nprocmgr.desktop) application(nscde-printmgr.desktop) application(nscde-stylemgr.desktop) application(nscde-sysinfo.desktop) application(nscde-systemaction.desktop) application(nscde-taskmgr.desktop) application(nscde-terminal.desktop) application(nscde-volumectrl.desktop) application(nscde-watcherrors.desktop) application(nscde-webbrowser.desktop) application(nscde-wspgmgr.desktop)"
RDEPENDS:${PN} += "/usr/bin/ksh93 /usr/bin/python3 fvwm2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXpm.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
