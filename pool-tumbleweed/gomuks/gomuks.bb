SUMMARY = "A terminal Matrix client written in Go"
DESCRIPTION = "A terminal Matrix client written in Go using mautrix and mauview. \
 \
Basic usage is possible, but expect bugs and missing features."
LICENSE = "AGPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "gomuks-0.3.0-2.5.aarch64.rpm"
RPM_HASH = "ebe069bc1a4e4d79e68ee48d722d5a515e2316fc36f3d74a92dda7445e770e630a56a0184464a19f103df4db50988eaa0526e1b3e49714d6796184c804c49939"

RPROVIDES:${PN} += "gomuks"

RDEPENDS:${PN} += "libc.so.6 \
libolm.so.3"

inherit rpm
