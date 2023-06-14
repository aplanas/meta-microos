SUMMARY = "A lightweight and flexible command-line JSON processor"
DESCRIPTION = "A lightweight and flexible command-line JSON processor. jq is like sed for \
JSON data – you can use it to slice and filter and map and transform \
structured data with the same ease that sed, awk, grep and friends let \
you play with text."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "jq-1.6-3.3.aarch64.rpm"
RPM_HASH = "b0b0f111e02712ac43a64dcde49a56a0868093a6013e833b064f1faf5d0ed040f4e9672223354bca9b4d704a86019fb4b049803951c591a332a795c7ae029fa7"

RPROVIDES:${PN} += "jq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjq.so.1 \
libjq1"

inherit rpm
