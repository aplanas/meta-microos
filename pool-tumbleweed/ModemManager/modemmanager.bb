SUMMARY = "DBus interface for modem handling"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "08f600b514f8b84b741f672233bd6709d26285eb9c2b19357fe49ab9ad3e90f1c167c7fff0c3d178eae6b25dfdc0163c2660af13c5da75e415175b336f91ee64"

RPROVIDES:${PN} += "ModemManager \
ModemManager(aarch-64) \
libmm-plugin-altair-lte.so()(64bit) \
libmm-plugin-anydata.so()(64bit) \
libmm-plugin-broadmobi.so()(64bit) \
libmm-plugin-cinterion.so()(64bit) \
libmm-plugin-dell.so()(64bit) \
libmm-plugin-dlink.so()(64bit) \
libmm-plugin-ericsson-mbm.so()(64bit) \
libmm-plugin-fibocom.so()(64bit) \
libmm-plugin-foxconn.so()(64bit) \
libmm-plugin-generic.so()(64bit) \
libmm-plugin-gosuncn.so()(64bit) \
libmm-plugin-haier.so()(64bit) \
libmm-plugin-huawei.so()(64bit) \
libmm-plugin-intel.so()(64bit) \
libmm-plugin-iridium.so()(64bit) \
libmm-plugin-linktop.so()(64bit) \
libmm-plugin-longcheer.so()(64bit) \
libmm-plugin-motorola.so()(64bit) \
libmm-plugin-mtk.so()(64bit) \
libmm-plugin-nokia-icera.so()(64bit) \
libmm-plugin-nokia.so()(64bit) \
libmm-plugin-novatel-lte.so()(64bit) \
libmm-plugin-novatel.so()(64bit) \
libmm-plugin-option-hso.so()(64bit) \
libmm-plugin-option.so()(64bit) \
libmm-plugin-pantech.so()(64bit) \
libmm-plugin-qcom-soc.so()(64bit) \
libmm-plugin-quectel.so()(64bit) \
libmm-plugin-samsung.so()(64bit) \
libmm-plugin-sierra-legacy.so()(64bit) \
libmm-plugin-sierra.so()(64bit) \
libmm-plugin-simtech.so()(64bit) \
libmm-plugin-telit.so()(64bit) \
libmm-plugin-thuraya.so()(64bit) \
libmm-plugin-tplink.so()(64bit) \
libmm-plugin-ublox.so()(64bit) \
libmm-plugin-via.so()(64bit) \
libmm-plugin-wavecom.so()(64bit) \
libmm-plugin-x22x.so()(64bit) \
libmm-plugin-zte.so()(64bit) \
libmm-shared-fibocom.so()(64bit) \
libmm-shared-foxconn.so()(64bit) \
libmm-shared-icera.so()(64bit) \
libmm-shared-novatel.so()(64bit) \
libmm-shared-option.so()(64bit) \
libmm-shared-sierra.so()(64bit) \
libmm-shared-telit.so()(64bit) \
libmm-shared-xmm.so()(64bit) \
org.freedesktop.ModemManager"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libmbim-glib.so.4()(64bit) \
libmm-glib.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libqmi-glib.so.5()(64bit) \
libqrtr-glib.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
