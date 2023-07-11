SUMMARY = "Python module for pysol-cards"
DESCRIPTION = "This module allows the python developer to generate the initial deals of some \
PySol FC games. It also supports PySol legacy deals and Microsoft FreeCell / \
Freecell Pro deals."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "python3-pysol-cards-0.14.2-1.3.noarch.rpm"
RPM_HASH = "490842cfbb3db5a7ca2b91052c04d3598d00e0f20835c95cbaf060216b82e6a7b7722f238cb08827af2c6f9be8653d2bb2a2d10769b6eb8c8b857096dab39e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysol-cards \
python3.11dist-pysol-cards \
python3dist-pysol-cards"

RDEPENDS:${PN} += "python-abi \
python3-random2 \
python3-six"

inherit rpm
