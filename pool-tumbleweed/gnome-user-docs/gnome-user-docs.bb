SUMMARY = "GNOME Desktop Documentation"
DESCRIPTION = "This package contains documents that are targeted for GNOME end-users."
LICENSE = "CC-BY-3.0"

PV = "44.3"

RPM_NAME = "gnome-user-docs-44.3-1.1.noarch.rpm"
RPM_HASH = "2b1514be0887b4b1d76afb3f70450ad5302ae9972e4d32d812247946c4bab2247a4d6863619f197ae217f7768db4533e10ecf74de09337eafc1084ff53209ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs"

RDEPENDS:${PN} += "yelp"

inherit rpm
