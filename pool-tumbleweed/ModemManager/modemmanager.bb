SUMMARY = "DBus interface for modem handling"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-1.20.6-1.2.aarch64.rpm"
RPM_HASH = "1c599bb30d0b1448a5e3ba05fb98ac3e09740bb26481032e5be1bdddd0a28a3aa4c3ffc2b17b6ac84a840d1b3b15b1519ad0341d5cea5be5ca07b3f7ca3e0eda"

RPROVIDES:${PN} += "ModemManager \
libmm-plugin-altair-lte.so \
libmm-plugin-anydata.so \
libmm-plugin-broadmobi.so \
libmm-plugin-cinterion.so \
libmm-plugin-dell.so \
libmm-plugin-dlink.so \
libmm-plugin-ericsson-mbm.so \
libmm-plugin-fibocom.so \
libmm-plugin-foxconn.so \
libmm-plugin-generic.so \
libmm-plugin-gosuncn.so \
libmm-plugin-haier.so \
libmm-plugin-huawei.so \
libmm-plugin-intel.so \
libmm-plugin-iridium.so \
libmm-plugin-linktop.so \
libmm-plugin-longcheer.so \
libmm-plugin-motorola.so \
libmm-plugin-mtk.so \
libmm-plugin-nokia-icera.so \
libmm-plugin-nokia.so \
libmm-plugin-novatel-lte.so \
libmm-plugin-novatel.so \
libmm-plugin-option-hso.so \
libmm-plugin-option.so \
libmm-plugin-pantech.so \
libmm-plugin-qcom-soc.so \
libmm-plugin-quectel.so \
libmm-plugin-samsung.so \
libmm-plugin-sierra-legacy.so \
libmm-plugin-sierra.so \
libmm-plugin-simtech.so \
libmm-plugin-telit.so \
libmm-plugin-thuraya.so \
libmm-plugin-tplink.so \
libmm-plugin-ublox.so \
libmm-plugin-via.so \
libmm-plugin-wavecom.so \
libmm-plugin-x22x.so \
libmm-plugin-zte.so \
libmm-shared-fibocom.so \
libmm-shared-foxconn.so \
libmm-shared-icera.so \
libmm-shared-novatel.so \
libmm-shared-option.so \
libmm-shared-sierra.so \
libmm-shared-telit.so \
libmm-shared-xmm.so \
org.freedesktop.ModemManager"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmbim-glib.so.4 \
libmm-glib.so.0 \
libpolkit-gobject-1.so.0 \
libqmi-glib.so.5 \
libqrtr-glib.so.0 \
libsystemd.so.0"

inherit rpm
