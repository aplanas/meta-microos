SUMMARY = "Enlightenment openSUSE branding"
DESCRIPTION = "openSUSE specific files as specific branding."
LICENSE = "GPL-2.0"

PV = "0.2"

RPM_NAME = "enlightenment-branding-openSUSE-0.2-1.5.aarch64.rpm"
RPM_HASH = "4cd801f2771a8523ebf2fccbbdbe646baf027ee03c1110a9f2027b2aae99fd864b39c66de2443e5a0063797fe973c12bf8931cc651a550cda652f2cfedfcbf17"

RPROVIDES:${PN} += "enlightenment-branding enlightenment-branding-openSUSE enlightenment-branding-openSUSE(aarch-64)"
RDEPENDS:${PN} += "enlightenment-profiles-openSUSE enlightenment-theme-openSUSE"

inherit rpm
