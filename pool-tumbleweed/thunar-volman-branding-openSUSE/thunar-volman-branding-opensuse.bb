SUMMARY = "openSUSE Branding of thunar-volman"
DESCRIPTION = "This package provides the openSUSE look and feel for the Thunar Volume Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "thunar-volman-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "4ed314d502f009bceff91ca465858d5aa8121f0376e20c73a784eafff6887e3c20570b4a7d88c9dee251b92cd069827f75906874e43eec5c9df1d7a9a70a9980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-thunar-volman-branding-openSUSE \
thunar-volman-branding \
thunar-volman-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
