SUMMARY = "Text-based Organizer"
DESCRIPTION = "Calcurse is a text-based personal organizer which helps keep track of events \
and everyday tasks. It has a calendar and a 'todo' list, and puts your \
appointments in order. The user interface is configurable, and you can choose \
between different color schemes and layouts. All of the commands are \
documented within an online help system."
LICENSE = "BSD-2-Clause"

PV = "4.8.1"

RPM_NAME = "calcurse-4.8.1-1.1.aarch64.rpm"
RPM_HASH = "f9fffff0024dbc0714e40528b4e5a26627b87cecdb176d7f02485ace5d541de5f49fbcd85cdce32ec265a4f8075b0cd89261deefd50bc750c69754bb976e1930"

RPROVIDES:${PN} += "calcurse"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
