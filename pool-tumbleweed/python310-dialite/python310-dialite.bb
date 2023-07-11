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

RPM_NAME = "python310-dialite-0.5.3-1.13.noarch.rpm"
RPM_HASH = "8a215a6e2b3942670752f56dc4e9ab88383534276f6d34b436f5f2b56417e03acf9cdd3a92e31fdd446236d9c6cbe36d0acd9ceeafefc791050a0274a297a94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dialite \
python310-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
