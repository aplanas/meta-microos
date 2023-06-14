SUMMARY = "Text-based Organizer"
DESCRIPTION = "Calcurse is a text-based personal organizer which helps keep track of events \
and everyday tasks. It has a calendar and a 'todo' list, and puts your \
appointments in order. The user interface is configurable, and you can choose \
between different color schemes and layouts. All of the commands are \
documented within an online help system."
LICENSE = "BSD-2-Clause"

PV = "4.8.0"

RPM_NAME = "calcurse-4.8.0-1.4.aarch64.rpm"
RPM_HASH = "488646baa1bd17429ba27672a30054b1a5d7c9088610121d57dd808c17c44d1887ae7d2233a2064ef4ee64ca73d9ef9260a52721caa28b021b1b1a9565666d72"

RPROVIDES:${PN} += "calcurse"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
