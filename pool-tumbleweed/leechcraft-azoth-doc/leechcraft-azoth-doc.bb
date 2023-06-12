SUMMARY = "LeechCraft Azoth Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Azoth API. \
 \
It contains description of Azoth API used for developing LeechCraft \
Azoth sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/azoth/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-doc-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "ba8ca1e3518e9358a678dc37d7f993f51ed80df252af03e5dbc55ba65870b14b51459ce2223d4b6de8a08cd7de4d96eb9b55c6d48adde2731103b73e963d5a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-azoth-doc"
RDEPENDS:${PN} += ""

inherit rpm
