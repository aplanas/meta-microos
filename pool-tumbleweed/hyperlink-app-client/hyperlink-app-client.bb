SUMMARY = "Handler program for the app protocol"
DESCRIPTION = "The app protocol defines the behaviour of a terminal emulator when opening a \
'app://' hyperlink. \
 \
The behaviour is basically to send via TCP/IP the given command to the given \
hostname and port. \
 \
This behaviour can be extracted in a separate program. A terminal emulator \
can simply invoke this program, passing it the URI on standard input. This way, \
the protocol logic does not need to be hardwired into any terminal emulator. \
 \
This package contains the reference implementation of such a handler program."
LICENSE = "GPL-3.0-or-later"

PV = "0.0~git5.211516e"

RPM_NAME = "hyperlink-app-client-0.0~git5.211516e-1.3.aarch64.rpm"
RPM_HASH = "53a29072f29a76814ff73d7c6c834ad21a1d0aadf779cb8e8e1336532fecc154718c8d118c2edf94c81baa1670df412e2e0cf959cb9a8cefcfc0d9b1c67d36b5"

RPROVIDES:${PN} += "hyperlink-app-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
