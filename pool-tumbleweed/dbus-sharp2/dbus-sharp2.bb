SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "dbus-sharp2-0.8.1-3.8.noarch.rpm"
RPM_HASH = "11c4088d91daced96d0e9012eb0b9351d41ac9bef44e7cbe5cfb8d820cf8990020f8da35bcde622808dcda6e24e20c5c2c499d97dcada955d133c9f4af7c2cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp2 \
mono-dbus-sharp"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-mscorlib"

inherit rpm
