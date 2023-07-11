SUMMARY = "Utility to list X resources in widgets"
DESCRIPTION = "The listres program generates a list of X resources for a widget \
in an X client written using a toolkit based on libXt."
LICENSE = "X11"

PV = "1.0.5"

RPM_NAME = "listres-1.0.5-1.7.aarch64.rpm"
RPM_HASH = "c894521aeb1f9069497227743e4c9aa64c4586fb4ec04b090dfa3b97c55c9e28abc3a37df82c56f78df0232b20529caaebbd4d865b7fea12a0845b26db51f92f"

RPROVIDES:${PN} += "listres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
