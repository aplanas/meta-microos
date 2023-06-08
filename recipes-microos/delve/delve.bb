SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Delve is a debugger for the Go programming language. The goal of \
the project is to provide a simple, full featured debugging tool \
for Go. Delve should be easy to invoke and easy to use. Chances are \
if you're using a debugger, things aren't going your way. With that \
in mind, Delve should stay out of your way as much as possible."
LICENSE = "MIT"

PV = "1.20.2"

RPM_NAME = "delve-1.20.2-1.1.aarch64.rpm"
RPM_HASH = "65c7402e6724d4829222d01499c20cbfaf8783912edee2c57b85b9d16343ddf24dbd21536a3cd7ea5be668785739e20fb5e5b831eedd21a5bcca8ff530d213b4"

RPROVIDES:${PN} += "delve delve(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
