SUMMARY = "Data files for MegaGlest"
DESCRIPTION = "Data files required for playing MegaGlest."
LICENSE = "CC-BY-SA-3.0"

PV = "3.13.0"

RPM_NAME = "megaglest-data-3.13.0-1.15.noarch.rpm"
RPM_HASH = "631cc739465d332463f7ce59883ad5b6c4ddf31d19fbc779a61f64b3a88e5a0186b586fbbd52728fda7860d3bd7c5f5697aef35e1cfa1ef13904c0da677877eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "megaglest-data"

RDEPENDS:${PN} += "/usr/bin/sh \
megaglest"

inherit rpm
