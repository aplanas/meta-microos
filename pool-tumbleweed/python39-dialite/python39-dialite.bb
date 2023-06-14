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

RPM_NAME = "python39-dialite-0.5.3-1.11.noarch.rpm"
RPM_HASH = "301a74c45a7cf371dc319671f7c99729d280058fa50c9fa41c2341168efccd6233dda18bfe2bf2e5ba3063f9f97c9e637d30a35488476ebceadc2a27cdf9196d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dialite \
python39-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
