SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Delve is a debugger for the Go programming language. The goal of \
the project is to provide a simple, full featured debugging tool \
for Go. Delve should be easy to invoke and easy to use. Chances are \
if you're using a debugger, things aren't going your way. With that \
in mind, Delve should stay out of your way as much as possible."
LICENSE = "MIT"

PV = "1.20.2"

RPM_NAME = "delve-1.20.2-1.2.aarch64.rpm"
RPM_HASH = "09627dadd79b5fd91acae479644d5de2504a9dae7c2f456f949335b23aa6081dc10847f9bf9da2e47cd465744bcf0244f7b51f8b8e4530dd3e9d7e46d3b54ded"

RPROVIDES:${PN} += "delve \
delve(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
