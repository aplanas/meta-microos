SUMMARY = "Translations for package ephoto"
DESCRIPTION = "Provides translations for the 'ephoto' package."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-lang-1.5-1.29.noarch.rpm"
RPM_HASH = "b257928d679239d4b85f60d2513aadbc64c37721a94afdcf0ee7f3b2751521eeed1f32b1134fafb7d619ef260e6d067f66976312165047d71479e63a354d9800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ephoto-lang \
ephoto-lang-all \
locale-ephoto-cs \
locale-ephoto-de \
locale-ephoto-fr \
locale-ephoto-it \
locale-ephoto-sk \
locale-ephoto-sl"

RDEPENDS:${PN} += "ephoto"

inherit rpm
