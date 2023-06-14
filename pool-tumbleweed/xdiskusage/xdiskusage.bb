SUMMARY = "Graphically displays the amount of disk space used by each subdirectory"
DESCRIPTION = "xdiskusage is a user-friendly program to show you what is using \
up all your disk space. It is based on the design of xdu \
written by Phillip C. Dykstra. Changes have been made so it runs \
'du' for you, and can display the free space left on the disk, \
and produce a PostScript version of the display."
LICENSE = "GPL-2.0-only"

PV = "1.60"

RPM_NAME = "xdiskusage-1.60-1.7.aarch64.rpm"
RPM_HASH = "98365edbddbafa4af18959b1d7ae9454783179d0532582d9fdd6b9eddd6b5c3b8b295e164b94169b7cf6d8808dd3df82c2f5fdc421b3b196b2faef6c9eaeae8a"

RPROVIDES:${PN} += "xdiskusage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
