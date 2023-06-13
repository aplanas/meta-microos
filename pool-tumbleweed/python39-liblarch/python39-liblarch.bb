SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python39-liblarch-3.0-2.15.noarch.rpm"
RPM_HASH = "f0b7a58312d53bd451e1a7537dd7a9f721307a94e4a93d32def9c0a38bab6996cc1b4e147b62307a68608bc558caff921ea0dcbd31b32ff89b7bf0eaacbe9fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(liblarch) \
python39-liblarch \
python3dist(liblarch)"

RDEPENDS:${PN} += "python(abi) \
python39-gobject"

inherit rpm
