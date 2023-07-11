SUMMARY = "The Viqr (Vietnamese) table for ibus-table"
DESCRIPTION = "ibus-table-viqr provides the Viqr (Vietnamese) table for ibus-table. Tiếng Việt \
/ Vietnamese"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-viqr-1.3.16-1.1.noarch.rpm"
RPM_HASH = "e8af44d1fdc298cce3e2f206a452e6c4b1ed9b67b40ed80146f079a2c22c9375d06431c979d8afcf5ea2166974d431fec05d3a363226885208b0913f3e49906f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-viqr \
locale-ibus-vi"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
