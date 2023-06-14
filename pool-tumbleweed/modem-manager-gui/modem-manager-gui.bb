SUMMARY = "Modem Manager GUI"
DESCRIPTION = "This program is simple graphical interface for Modem Manager \
daemon dbus interface. \
Current features: \
- View device information: Operator name, Mode, IMEI, IMSI, \
  Signal level. \
- Send and receive SMS messages with long massages \
  concatenation and store messages in database. \
- Send USSD requests and read answers in GSM7 and UCS2 formats \
  converted to system UTF8 charset. \
- Scan available mobile networks."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.20"

RPM_NAME = "modem-manager-gui-0.0.20-4.3.aarch64.rpm"
RPM_HASH = "0a2d3fe9c3806b0ac6878f2a360355f74ef3edeb1d114761db6bbba9c9995ae9063ad48529ca0b44c61bbe1cdc3efdfe8a567e6baa1d11a7010cf89aa02359d9"

RPROVIDES:${PN} += "libmodcm-connman112.so \
libmodcm-nm09.so \
libmodcm-pppd245.so \
libmodmm-mm06.so \
libmodmm-mm07.so \
libmodmm-ofono109.so \
modem-manager-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
ModemManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdbm.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
