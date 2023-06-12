SUMMARY = "The GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-44.2-1.1.aarch64.rpm"
RPM_HASH = "0a94948baf1eb0ea39ec838e7de1a9926e2d9b7f0336a77e99196ba2a6bee13b89ee91f8b26610f9d22a78411d1f627288c2e1f973f33a2117c79db04455d274"

RPROVIDES:${PN} += "application() \
application(gnome-applications-panel.desktop) \
application(gnome-background-panel.desktop) \
application(gnome-bluetooth-panel.desktop) \
application(gnome-camera-panel.desktop) \
application(gnome-datetime-panel.desktop) \
application(gnome-default-apps-panel.desktop) \
application(gnome-diagnostics-panel.desktop) \
application(gnome-display-panel.desktop) \
application(gnome-firmware-security-panel.desktop) \
application(gnome-info-overview-panel.desktop) \
application(gnome-keyboard-panel.desktop) \
application(gnome-location-panel.desktop) \
application(gnome-microphone-panel.desktop) \
application(gnome-mouse-panel.desktop) \
application(gnome-multitasking-panel.desktop) \
application(gnome-network-panel.desktop) \
application(gnome-notifications-panel.desktop) \
application(gnome-power-panel.desktop) \
application(gnome-printers-panel.desktop) \
application(gnome-region-panel.desktop) \
application(gnome-removable-media-panel.desktop) \
application(gnome-screen-panel.desktop) \
application(gnome-search-panel.desktop) \
application(gnome-sharing-panel.desktop) \
application(gnome-sound-panel.desktop) \
application(gnome-thunderbolt-panel.desktop) \
application(gnome-universal-access-panel.desktop) \
application(gnome-usage-panel.desktop) \
application(gnome-user-accounts-panel.desktop) \
application(gnome-wacom-panel.desktop) \
application(gnome-wifi-panel.desktop) \
application(gnome-wwan-panel.desktop) \
application(org.gnome.Settings.desktop) \
gnome-control-center \
gnome-control-center(aarch-64) \
metainfo() \
metainfo(org.gnome.Settings.appdata.xml)"
RDEPENDS:${PN} += "gnome-settings-daemon \
gnome-themes-accessibility \
gnome-version \
gnomekbd-tools \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libaccountsservice.so.0()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcolord-gtk4.so.1()(64bit) \
libcolord.so.2()(64bit) \
libcups.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-bg-4.so.2()(64bit) \
libgnome-bluetooth-ui-3.0.so.13()(64bit) \
libgnome-desktop-4.so.2()(64bit) \
libgnome-rr-4.so.2()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgoa-1.0.so.0()(64bit) \
libgoa-backend-1.0.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgtop-2.0.so.11()(64bit) \
libgudev-1.0.so.0()(64bit) \
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
libnm.so.0(libnm_1_14_0)(64bit) \
libnm.so.0(libnm_1_16_0)(64bit) \
libnm.so.0(libnm_1_24_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_40_0)(64bit) \
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_2_0)(64bit) \
libnma-gtk4.so.0(libnma_1_8_28)(64bit) \
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