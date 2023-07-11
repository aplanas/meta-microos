SUMMARY = "Tool for selecting and copying text from stdin without a mouse"
DESCRIPTION = "Read input from stdin and display a selection interface that allows a field \
to be selected and copied to the clipboard. Fields are either recognized by \
a regular expression using the -g option or by splitting the input on a \
delimiter sequence using the -d option."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "yank-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "0503b2d442e5ff781cfb7cdae5e46fd0aa893a16a66c62330235935d492e7d10bc0907730ebd9f97350372b9a3e8b29a3b8e8f0d09db21a24ef3838fc5c502fb"

RPROVIDES:${PN} += "yank"

RDEPENDS:${PN} += "bash \
libc.so.6"

inherit rpm
