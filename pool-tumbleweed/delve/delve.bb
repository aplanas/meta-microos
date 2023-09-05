SUMMARY = "Debugger for the Go Programming Language"
DESCRIPTION = "Delve is a debugger for the Go programming language. The goal of \
the project is to provide a simple, full featured debugging tool \
for Go. Delve should be easy to invoke and easy to use. Chances are \
if you're using a debugger, things aren't going your way. With that \
in mind, Delve should stay out of your way as much as possible."
LICENSE = "MIT"

PV = "1.21.0"

RPM_NAME = "delve-1.21.0-2.1.aarch64.rpm"
RPM_HASH = "2219f7d90eeabbaac090b0b985ec38d473fca8af9fe5b2a4acb66660a4c4fbd176456d617560881471ecdea9866447dcb6350754170f459f4fa56911c1eaec9d"

RPROVIDES:${PN} += "delve"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
