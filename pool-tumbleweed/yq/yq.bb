SUMMARY = "A portable command-line YAML processor"
DESCRIPTION = "A lightweight and portable command-line YAML processor. yq uses jq like syntax \
but works with yaml files as well as json. It doesn't yet support everything \
jq does - but it does support the most common operations and functions, and more \
is being added continuously."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-4.33.3-1.3.aarch64.rpm"
RPM_HASH = "5014c382cc6c976e194a1269863d67e3b9d4582b30a87b1f9fe4e77a0e7b38e7cd0594d1b8a862a089cb417267834e1a8d995693aaadbb34e1b7a7d580fad98c"

RPROVIDES:${PN} += "yq"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
