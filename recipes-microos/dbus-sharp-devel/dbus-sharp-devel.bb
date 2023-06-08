SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "dbus-sharp-devel-0.7.0-18.8.noarch.rpm"
RPM_HASH = "233d30de9e4667baa723203a70a2d9eae2afeb2da1cc7ec4c6a86d8eb7fa2091bf7c2ec5b3f831f2ee93637772e228a481cebcc74eeb76dc07ce3182f88e41ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-devel pkgconfig(dbus-sharp-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config dbus-sharp"

inherit rpm
