SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "dbus-sharp-0.7.0-18.8.noarch.rpm"
RPM_HASH = "8611d16abf21d6682bf61c7316c3cd3463ba7c301bad69417a3d53e963a26524d209fcd32cfe505d768cf5521ed1a92febc6213e36e132f3fb91b3dc43589591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp \
mono(dbus-sharp)"
RDEPENDS:${PN} += "mono(System) \
mono(System.Core) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
