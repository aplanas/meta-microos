SUMMARY = "MATE Desktop panel applet to display sensor readings"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-applet-sensors-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "4a31e6c9d5c486177d216e56c48e16c21b4e378dd4041a613dff92cc993d6080ed9c0db4f6fcef60e2fa047615b177baf7ca134f1088210030fb79bf5b2316fe"

RPROVIDES:${PN} += "libacpi.so \
libhddtemp.so \
libi8k.so \
libibm-acpi.so \
liblibsensors.so \
libmbmon.so \
libomnibook.so \
libpmu-sys.so \
libsmu-sys.so \
libsonypi.so \
libudisks2.so \
mate-applet-sensors \
mate-sensors-applet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1 \
libmate-sensors-applet-plugin.so.0 \
libnotify.so.4 \
libsensors.so.4 \
mate-panel"

inherit rpm
