SUMMARY = "Tool for selecting and copying text from stdin without a mouse"
DESCRIPTION = "Read input from stdin and display a selection interface that allows a field \
to be selected and copied to the clipboard. Fields are either recognized by \
a regular expression using the -g option or by splitting the input on a \
delimiter sequence using the -d option."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "yank-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "911d78516e92dc5cc2ee00594fb0a0f66d92596c1946954220c2776db39e61f78e5851bcc17ccb56b5e7143aceb13a86753a23e4c3b80932ab1483fb317b823f"

RPROVIDES:${PN} += "yank"

RDEPENDS:${PN} += "bash \
libc.so.6"

inherit rpm
