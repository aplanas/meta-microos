SUMMARY = "HH2Serial GPS plugin for connman"
DESCRIPTION = "Provides HH2Serial GPS device support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-hh2serial-gps-1.41-4.8.aarch64.rpm"
RPM_HASH = "33f8b874af31c56a37a9474dc2367f6d752f1fa22ec15062bf6b00796e0e68d2e50aece213629edd996dcadc2b4ceb3e0e5375790d448696e0a6cdf10cee7770"

RPROVIDES:${PN} += "connman-plugin-hh2serial-gps"

RDEPENDS:${PN} += "connman \
libc.so.6"

inherit rpm
