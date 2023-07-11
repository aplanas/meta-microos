SUMMARY = "LeechCraft Azoth Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Azoth API. \
 \
It contains description of Azoth API used for developing LeechCraft \
Azoth sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/azoth/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-doc-0.6.70+git.14794.g33744ae6ce-3.3.noarch.rpm"
RPM_HASH = "255337b06a6c4e034e8c4aac952d532447f60ff3b827666809d890ebbf8715e126c1377ea2a6b2df30dd3c6621189f2f5af6eef8314244753af15e344c449484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-azoth-doc"

RDEPENDS:${PN} += ""

inherit rpm
