SUMMARY = "Fork of GNOME Control Center for Budgie 10"
DESCRIPTION = "Fork of GNOME Control Center for Budgie 10"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0+0"

RPM_NAME = "budgie-control-center-1.2.0+0-1.3.aarch64.rpm"
RPM_HASH = "9f4e45f3d70957ae118286ee3ec65e6da37fa0c721b5820c53359c9c61859e8506cd316bf720d62382c277cceda97dfde2246aad901e0f42c3acef13aab8091f"

RPROVIDES:${PN} += "application() \
application(budgie-applications-panel.desktop) \
application(budgie-background-panel.desktop) \
application(budgie-bluetooth-panel.desktop) \
application(budgie-camera-panel.desktop) \
application(budgie-color-panel.desktop) \
application(budgie-control-center.desktop) \
application(budgie-datetime-panel.desktop) \
application(budgie-default-apps-panel.desktop) \
application(budgie-diagnostics-panel.desktop) \
application(budgie-display-panel.desktop) \
application(budgie-info-overview-panel.desktop) \
application(budgie-keyboard-panel.desktop) \
application(budgie-location-panel.desktop) \
application(budgie-microphone-panel.desktop) \
application(budgie-mouse-panel.desktop) \
application(budgie-multitasking-panel.desktop) \
application(budgie-network-panel.desktop) \
application(budgie-notifications-panel.desktop) \
application(budgie-online-accounts-panel.desktop) \
application(budgie-power-panel.desktop) \
application(budgie-printers-panel.desktop) \
application(budgie-region-panel.desktop) \
application(budgie-removable-media-panel.desktop) \
application(budgie-sharing-panel.desktop) \
application(budgie-sound-panel.desktop) \
application(budgie-thunderbolt-panel.desktop) \
application(budgie-universal-access-panel.desktop) \
application(budgie-usage-panel.desktop) \
application(budgie-user-accounts-panel.desktop) \
application(budgie-wacom-panel.desktop) \
application(budgie-wifi-panel.desktop) \
application(budgie-wwan-panel.desktop) \
budgie-control-center \
budgie-control-center(aarch-64) \
metainfo() \
metainfo(budgie-control-center.appdata.xml)"

RDEPENDS:${PN} += "colord \
gnome-color-manager \
gnome-online-accounts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libaccountsservice.so.0()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcheese-gtk.so.25()(64bit) \
libcheese.so.8()(64bit) \
libcolord-gtk.so.1()(64bit) \
libcolord.so.2()(64bit) \
libcups.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-bluetooth.so.13()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgoa-1.0.so.0()(64bit) \
libgoa-backend-1.0.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libgudev-1.0.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libibus-1.0.so.5()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmalcontent-0.so.0()(64bit) \
libmm-glib.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_12_0)(64bit) \
libnm.so.0(libnm_1_24_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libpwquality.so.1()(64bit) \
libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) \
libsecret-1.so.0()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) \
libudisks2.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
