SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python310-liblarch-3.0-2.15.noarch.rpm"
RPM_HASH = "e0063d616afeada48854337070f1de262bd2309d8d0719731acd9ad478a6fd5f7173fed680c6c9f8e6786b394401a66e7aab14bc7b72765380be27714434e58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch \
python3.10dist-liblarch \
python310-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python310-gobject"

inherit rpm
