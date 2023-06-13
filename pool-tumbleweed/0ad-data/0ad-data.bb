SUMMARY = "The Data Files for 0 AD"
DESCRIPTION = "0 A.D. (pronounced 'zero ey-dee') is a free, open-source, cross-platform real-time \
strategy (RTS) game of ancient warfare. In short, it is a historically-based \
war/economy game that allows players to relive or rewrite the history of Western \
civilizations, focusing on the years between 500 B.C. and 500 A.D. The project is \
highly ambitious, involving state-of-the-art 3D graphics, detailed artwork, sound, \
and a flexible and powerful custom-built game engine. \
 \
The game has been in development by Wildfire Games (WFG), a group of volunteer, \
hobbyist game developers, since 2001. The code and data are available under the GPL \
license, and the art, sound and documentation are available under CC-BY-SA."
LICENSE = "CC-BY-SA-3.0 & LPPL-1.3c+ & GPL-3.0-or-later"

PV = "0.0.26"

RPM_NAME = "0ad-data-0.0.26-1.2.noarch.rpm"
RPM_HASH = "638c11cf46d36bb4fc661997226542add4d1dad1a9d3177c84de38425e01a993f1fa1ec20dedde356d6e7a646a2521090a33743ed9be5befd9a08fc4d90ccc80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "0ad-data"

RDEPENDS:${PN} += "dejavu-fonts \
gnu-free-fonts"

inherit rpm
