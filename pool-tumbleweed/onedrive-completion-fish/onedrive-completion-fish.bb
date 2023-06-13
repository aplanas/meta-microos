SUMMARY = "OneDrive fish completition"
DESCRIPTION = "OneDrive shell completions for fish."
LICENSE = "GPL-3.0-only"

PV = "2.4.23"

RPM_NAME = "onedrive-completion-fish-2.4.23-1.4.aarch64.rpm"
RPM_HASH = "404d8eeaff481cce19ad94bf126d2c219c0c0ab25550ffa92c400e16aac960bd2844e7f7d3648a7b0c846d713f3a45ef162189886e8090c343ab303dd747ae8e"

RPROVIDES:${PN} += "onedrive-completion-fish \
onedrive-completion-fish(aarch-64)"

RDEPENDS:${PN} += "fish"

inherit rpm
