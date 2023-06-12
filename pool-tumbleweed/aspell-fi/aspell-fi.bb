SUMMARY = "Finnish (suomi) Dictionary for Aspell"
DESCRIPTION = "A Finnish (suomi) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "aspell-fi-0.7-2.14.aarch64.rpm"
RPM_HASH = "5e2135d7205372ab57b55082a4733e6f5006428871ef06939aa9a6e10057c384d3ea3996e2806462af0d6a9d9a7337fd4f02745dacb61678cb9607fecd27c7c5"

RPROVIDES:${PN} += "aspell-fi \
aspell-fi(aarch-64) \
locale(aspell:fi)"
RDEPENDS:${PN} += ""

inherit rpm
