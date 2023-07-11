SUMMARY = "LeechCraft Monocle Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Monocle API. \
 \
It contains description of Monocle API used for developing LeechCraft \
Monocle sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/monocle/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-doc-0.6.70+git.14794.g33744ae6ce-3.3.noarch.rpm"
RPM_HASH = "c59ba286e1134c168285c86c4d36ed33e593331149ad16ea4ded45512ae4d54067375d9da1e6d57b6a79d9d56566171c46f662043017280079b654b8ab1e7dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-monocle-doc"

RDEPENDS:${PN} += ""

inherit rpm
