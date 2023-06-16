SUMMARY = "Arcade-style 2D firefighting action"
DESCRIPTION = "Mr. Rescue is an arcade styled 2d action game centered \
around evacuating civilians from burning buildings. \
 \
The game features fast paced fire extinguishing action, \
intense boss battles, a catchy soundtrack and lots of \
throwing people around in pseudo-randomly generated \
buildings."
LICENSE = "Zlib & MIT & CC-BY-SA-3.0"

PV = "1.02e"

RPM_NAME = "mrrescue-1.02e-5.11.noarch.rpm"
RPM_HASH = "e66b30aaf4536ff545c15536c21030e33ea025c9ec2af88919405a0f569ec78ceca741e5def136c2be60fe6334b49eee53a9c0cdc7105fc05bb86b896973a1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mrrescue"

RDEPENDS:${PN} += "/usr/bin/sh \
love \
update-desktop-files"

inherit rpm
