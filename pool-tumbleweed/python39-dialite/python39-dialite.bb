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

RPM_NAME = "python39-dialite-0.5.3-1.13.noarch.rpm"
RPM_HASH = "dc03e3f0b0dae7039a49569446ca662d7e85d47aba5e2f9453089da2a331ae1e0e105bc0834a45a9c12c7a89fe428a0d2ca373eccb74cbdccfe82e4d909563e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dialite \
python39-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
