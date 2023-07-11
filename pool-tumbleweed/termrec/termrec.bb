SUMMARY = "Records Videos of Terminal Output"
DESCRIPTION = "Termrec is a program for recording 'videos' of terminal output. \
 \
Utilities provided are \
- termplay the player. \
- termrec the console recorder. Allows you to capture the output \
of a console program. \
- proxyrec a telnet proxy. Will capture the session to a file. \
- termtime takes one of more ttyrecs. Measures their lengths. \
Prints that. \
- termcat copies a ttyrec, possibly converting it to a different \
format and/or combining several ttyrecs together."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "termrec-0.19-1.14.aarch64.rpm"
RPM_HASH = "b5ee659a3dab1240bd903cf82d00293d7013771206ed4dbfd68eaee91e0a243c0b273c3692c79c7466042de4e3126b3c2fffad50d09aa13caf7ef4c7b879074a"

RPROVIDES:${PN} += "termrec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtty.so.1 \
libtty1"

inherit rpm
