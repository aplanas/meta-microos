SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "dbus-sharp2-devel-0.8.1-3.8.noarch.rpm"
RPM_HASH = "519ccae6e736caef8a653c0f2a7d6916af8756be804a600eb25ca1790621a155613dd6f41e97ef7dad7a6b35a7ee994ab44b3621170fe6046b3f276aa8ba6747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp2-devel \
pkgconfig(dbus-sharp-2.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-sharp2"

inherit rpm
