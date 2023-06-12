SUMMARY = "Numix Cinnamon Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. \
This package contains the Cinnamon theme."
LICENSE = "AGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "cinnamon-metatheme-numix-3.0-1.11.noarch.rpm"
RPM_HASH = "13caf9467da8bdcf49c19b145986fc6fe0baf0e95421542e9b22f4d74d3d1bea738ccc50765c7dc48013471cdddc82a69cd67d8f019ff06f589b6974ac62819e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-metatheme-numix"
RDEPENDS:${PN} += "cinnamon \
metatheme-numix-common"

inherit rpm
