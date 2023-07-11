SUMMARY = "A lightweight and flexible command-line JSON processor"
DESCRIPTION = "A lightweight and flexible command-line JSON processor. jq is like sed for \
JSON data – you can use it to slice and filter and map and transform \
structured data with the same ease that sed, awk, grep and friends let \
you play with text."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "jq-1.6-3.4.aarch64.rpm"
RPM_HASH = "b39e19ca133d10f0716c48f08bead062f61b017fa9775878fbe5b9694239ba34adce04f08b7945dfc0db75b2c3637d830613fa03c96d64e90a73d30175ee8986"

RPROVIDES:${PN} += "jq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjq.so.1 \
libjq1"

inherit rpm
