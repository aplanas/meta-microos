SUMMARY = "Graphically displays the amount of disk space used by each subdirectory"
DESCRIPTION = "xdiskusage is a user-friendly program to show you what is using \
up all your disk space. It is based on the design of xdu \
written by Phillip C. Dykstra. Changes have been made so it runs \
'du' for you, and can display the free space left on the disk, \
and produce a PostScript version of the display."
LICENSE = "GPL-2.0-only"

PV = "1.60"

RPM_NAME = "xdiskusage-1.60-1.8.aarch64.rpm"
RPM_HASH = "8ca97f81a1764e9a42abe533d4dcc46318cef65532091837b346e1e37fa1002169d3a0849f465fee85ccb2f1668c7a6403dbca363171e064e72b7252e2d1ef41"

RPROVIDES:${PN} += "xdiskusage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
