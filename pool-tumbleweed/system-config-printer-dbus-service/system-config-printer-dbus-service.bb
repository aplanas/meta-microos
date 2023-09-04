SUMMARY = "D-Bus service to configure printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This packages provides a D-Bus service to configure printers and manage \
print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-dbus-service-1.5.18-3.1.noarch.rpm"
RPM_HASH = "b32923a753f777f4d30c3810f5d5f1bbd1820b43cad88368698adcf90219b06357c655b8ab67f6b72943e5cf05d72643c726d0ef0e008748f9026faaeb86b635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-dbus-service"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer-common"

inherit rpm
