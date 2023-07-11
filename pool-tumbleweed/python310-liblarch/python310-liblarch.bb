SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python310-liblarch-3.0-2.17.noarch.rpm"
RPM_HASH = "323614bf73d60d6c240d04cd7b1662ddbe2953f8374bd19f3c2ce4917a1c04bfa7f91a49f5d573f637c00a96cb1bf3b2911567b80bfc65319735aecf7c30695f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-liblarch \
python310-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python310-gobject"

inherit rpm
