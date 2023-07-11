SUMMARY = "Python library to show simple dialogs"
DESCRIPTION = "Dialite is a pure Python package to show dialogs. It provides a \
handful of functions, each a verb, that can be used to inform(), \
warn() or fail() the user, or to ask_ok(), ask_retry() or \
ask_yesno(). \
 \
Dialite can show graphical dialogs, and falls back to a terminal \
interface if dialogs are unavailable (e.g. if not supported by the \
platform, or for SSH connections)."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python311-dialite-0.5.3-1.13.noarch.rpm"
RPM_HASH = "81aba97874de812936039b68db22f45e3b2c624f36681abb6e166e69997a53a5c733349c4bb636325fc507bfef13829e77f1669bc209ab8bcb7a809df6775665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dialite \
python3.11dist-dialite \
python311-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
