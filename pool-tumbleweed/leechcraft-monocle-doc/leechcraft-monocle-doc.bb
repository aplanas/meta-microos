SUMMARY = "LeechCraft Monocle Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Monocle API. \
 \
It contains description of Monocle API used for developing LeechCraft \
Monocle sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/monocle/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-doc-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "91f8583a1a276cdf1c519a361fdc11565d1f815a65fdf767ae0574f4f543eef130cae79a761366b96c0b03f6f68e9ed8f82d142323f733813d7ecde44eb046f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-monocle-doc"

RDEPENDS:${PN} += ""

inherit rpm
