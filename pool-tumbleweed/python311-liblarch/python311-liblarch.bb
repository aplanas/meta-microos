SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python311-liblarch-3.0-2.15.noarch.rpm"
RPM_HASH = "efb55e0c95e4284f72ff5231d3e2113e976991e8d3868c36b6c63ae8d178d31211ab63e8d254fb36aa5c29b5095758883473a326c178d06c9846fc14ee24a817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-liblarch \
python311-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python311-gobject"

inherit rpm
