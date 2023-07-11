SUMMARY = "Modular Internet Client Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft core API. \
 \
It contains description of core API used for developing first-level \
LeechCraft plugins. For developing sub-plugins, please refer to \
corresponding packages (like leechcraft-azoth-doc). This documentation \
is also available online at http://doc.leechcraft.org/core/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-doc-0.6.70+git.14794.g33744ae6ce-3.3.noarch.rpm"
RPM_HASH = "12d03fa6e764f84db66f494c57a88c3871a3c7ad3a120430b2118a877808aa3410905b4a69f8ed38b8742dbcc10ef5f5a4a7d603e72e7b9575e3af930fada0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-doc"

RDEPENDS:${PN} += ""

inherit rpm
