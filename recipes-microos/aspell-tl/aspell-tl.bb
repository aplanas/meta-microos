SUMMARY = "Tagalog Dictionary for Aspell"
DESCRIPTION = "A Tagalog dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-tl-0.02-2.14.aarch64.rpm"
RPM_HASH = "606b40d30cba4e61b869e27fd32f110505afff4943f501248910aea6ff03b2e81641b8cb109821de1aa50e566174049587d5bccdc74d25ff53f8f8de9f8f44d6"

RPROVIDES:${PN} += "aspell-tl \
aspell-tl(aarch-64) \
locale(aspell:tl)"
RDEPENDS:${PN} += ""

inherit rpm
