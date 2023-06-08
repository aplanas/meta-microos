SUMMARY = "Game Data for Fish Fillets - Next Generation"
DESCRIPTION = "Fish Fillets is strictly a puzzle game. The goal in each of the 70 \
levels is always the same: to find a safe way out. The fish utter witty \
remarks about their surroundings and the various inhabitants of their \
underwater realm quarrel among themselves or comment on the efforts of \
your fish. The whole game is accompanied by quiet, comforting music. \
 \
This package contains data for the game."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "fillets-ng-data-1.0.1-1.16.noarch.rpm"
RPM_HASH = "c2fdd635e35d659ae26882b30025809df5725feea214d2737713d3deba1c80aa2fe9e2891fc651c176bcef72aa396cca065226507cef8780bb7eba61249b8560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fillets-ng-data"
RDEPENDS:${PN} += "fillets-ng"

inherit rpm
