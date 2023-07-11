SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Delve is a debugger for the Go programming language. The goal of \
the project is to provide a simple, full featured debugging tool \
for Go. Delve should be easy to invoke and easy to use. Chances are \
if you're using a debugger, things aren't going your way. With that \
in mind, Delve should stay out of your way as much as possible."
LICENSE = "MIT"

PV = "1.21.0"

RPM_NAME = "delve-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "4b71abf551adb456bed6acde822e195c4065a6635c22cabddf2271c781e3e2f50d509d783dc62f913bb69b8d9839bb1c3e247254b3ba4c3c27a055bb089b0269"

RPROVIDES:${PN} += "delve"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
