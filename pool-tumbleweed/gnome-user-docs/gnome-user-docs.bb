SUMMARY = "GNOME Desktop Documentation"
DESCRIPTION = "This package contains documents that are targeted for GNOME end-users."
LICENSE = "CC-BY-3.0"

PV = "44.1"

RPM_NAME = "gnome-user-docs-44.1-1.1.noarch.rpm"
RPM_HASH = "530925d6b4cffc244e4bba68dbab16cb3e4e25d56ab1a4be256e56dc512bda669fc42d549af1b6df5b90c3c0f278713222717928e744c6e998f98963140b445f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs"

RDEPENDS:${PN} += "yelp"

inherit rpm
