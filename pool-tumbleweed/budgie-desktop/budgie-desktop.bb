SUMMARY = "GTK3 Desktop Environment"
DESCRIPTION = "Budgie Desktop is the flagship desktop for the Solus Operating System."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "d8fcbd9b80fed3419e45ac665d8b8c11430005694221dfc44278de5e1d7607f26f2a3e57bff5d359b4a51cd9e54a5ea6d630f19d81739cfc5fa404e300e46761"

RPROVIDES:${PN} += "budgie-desktop \
libbudgiemenuapplet.so \
libcaffeineapplet.so \
libclockapplet.so \
libgvc.so \
libicontasklistapplet.so \
libkeyboardlayoutapplet.so \
liblockkeysapplet.so \
libnightlightapplet.so \
libnotificationsapplet.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.Calendar.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.MediaControls.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundInput.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.SoundOutput.so \
liborg.buddiesofbudgie.budgie-desktop.raven.widget.UsageMonitor.so \
libplacesindicator.so \
libraventriggerapplet.so \
libseparatorapplet.so \
libshowdesktopapplet.so \
libspacerapplet.so \
libstatusapplet.so \
libtasklistapplet.so \
libtrayapplet.so \
libuserindicator.so \
libworkspacesapplet.so"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager-applet \
budgie-control-center \
budgie-desktop-branding \
budgie-desktop-view \
budgie-screensaver \
gnome-bluetooth \
gnome-session-core \
gnome-settings-daemon \
ibus \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXcomposite.so.1 \
libasound.so.2 \
libbudgie-appindexer.so.0 \
libbudgie-appindexer0 \
libbudgie-plugin.so.0 \
libbudgie-plugin0 \
libbudgie-private.so.0 \
libbudgie-private0 \
libbudgie-raven-plugin.so.0 \
libbudgie-raven-plugin0 \
libbudgietheme.so.0 \
libbudgietheme0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgnome-bluetooth.so.13 \
libgnome-desktop-3.so.20 \
libgnomesu \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libm.so.6 \
libmutter-12.so.0 \
libmutter-clutter-12.so.0 \
libmutter-cogl-12.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libraven.so.0 \
libraven0 \
libupower-glib.so.3 \
libuuid.so.1 \
libwnck-3.so.0 \
typelib-1-0-Budgie-1-0 \
typelib-1-0-BudgieRaven-1-0 \
update-alternatives \
xdg-user-dirs-gtk \
zenity"

inherit rpm
