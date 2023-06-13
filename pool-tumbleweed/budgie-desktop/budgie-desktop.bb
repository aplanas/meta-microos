SUMMARY = "GTK3 Desktop Environment"
DESCRIPTION = "Budgie Desktop is the flagship desktop for the Solus Operating System."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "562ddef3cb788e371a191433b9be795908fb698c4241772908363cd0a9cafabc651643819718f5f87db839947dd678c96053c1f80238e4cc86eed8d2630a00ab"

RPROVIDES:${PN} += "application() \
application(org.buddiesofbudgie.BudgieDaemon.desktop) \
application(org.buddiesofbudgie.BudgieDesktopSettings.desktop) \
application(org.buddiesofbudgie.BudgiePanel.desktop) \
application(org.buddiesofbudgie.BudgiePolkit.desktop) \
application(org.buddiesofbudgie.BudgieScreenshot.desktop) \
application(org.buddiesofbudgie.BudgieWm.desktop) \
budgie-desktop \
budgie-desktop(aarch-64) \
libbudgiemenuapplet.so()(64bit) \
libcaffeineapplet.so()(64bit) \
libclockapplet.so()(64bit) \
libgvc.so()(64bit) \
libicontasklistapplet.so()(64bit) \
libkeyboardlayoutapplet.so()(64bit) \
liblockkeysapplet.so()(64bit) \
libnightlightapplet.so()(64bit) \
libnotificationsapplet.so()(64bit) \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.Calendar.so()(64bit) \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.MediaControls.so()(64bit) \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundInput.so()(64bit) \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundOutput.so()(64bit) \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.UsageMonitor.so()(64bit) \
libplacesindicator.so()(64bit) \
libraventriggerapplet.so()(64bit) \
libseparatorapplet.so()(64bit) \
libshowdesktopapplet.so()(64bit) \
libspacerapplet.so()(64bit) \
libstatusapplet.so()(64bit) \
libtasklistapplet.so()(64bit) \
libtrayapplet.so()(64bit) \
libuserindicator.so()(64bit) \
libworkspacesapplet.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
NetworkManager-applet \
budgie-control-center \
budgie-desktop-branding \
budgie-desktop-view \
budgie-screensaver \
gnome-bluetooth \
gnome-session-core \
gnome-settings-daemon \
ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libbudgie-appindexer.so.0()(64bit) \
libbudgie-appindexer0 \
libbudgie-plugin.so.0()(64bit) \
libbudgie-plugin0 \
libbudgie-private.so.0()(64bit) \
libbudgie-private0 \
libbudgie-raven-plugin.so.0()(64bit) \
libbudgie-raven-plugin0 \
libbudgietheme.so.0()(64bit) \
libbudgietheme0 \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-bluetooth.so.13()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgnomesu \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmutter-12.so.0()(64bit) \
libmutter-clutter-12.so.0()(64bit) \
libmutter-cogl-12.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libraven.so.0()(64bit) \
libraven0 \
libupower-glib.so.3()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libuuid.so.1(UUID_2.20)(64bit) \
libwnck-3.so.0()(64bit) \
typelib-1_0-Budgie-1_0 \
typelib-1_0-BudgieRaven-1_0 \
update-alternatives \
xdg-user-dirs-gtk \
zenity"

inherit rpm
