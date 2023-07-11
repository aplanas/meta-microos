SUMMARY = "File system directory change monitoring tool"
DESCRIPTION = "GNU Direvent monitors events in the file system directories. For each event \
that occurs in a set of pre-configured directories, the program calls an \
external program associated with it, supplying it with the information about \
the event and the location within the file system where it occured."
LICENSE = "GPL-3.0-or-later"

PV = "5.3"

RPM_NAME = "direvent-5.3-1.7.aarch64.rpm"
RPM_HASH = "4fec32acc595ebd5b446fad26261899c9767b076fadd82bffc2542752fe385284383123f0288d6ca9bf7c3771bc720ca75de81ca1f8beec03efe7d6cf6f637a7"

RPROVIDES:${PN} += "direvent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
