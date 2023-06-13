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

RPM_NAME = "python310-dialite-0.5.3-1.11.noarch.rpm"
RPM_HASH = "a4dc40bd371def6154eb10a426eff9e1d03c41f920058a55e1bf20c3e424055a1fe8eac30b25bda6544f90c55ac1f6bc4b10fb491c4f7de48c235eba251a381f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dialite \
python3.10dist(dialite) \
python310-dialite \
python3dist(dialite)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
