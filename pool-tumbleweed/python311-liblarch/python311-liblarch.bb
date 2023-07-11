SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python311-liblarch-3.0-2.17.noarch.rpm"
RPM_HASH = "4eeed0a2f5624933c91a74a4000ed533900507a23b8a2048f233be4568a0ecddeb09e8b384334af39953e7010a57a602415d29d492b7642757c00c1bd21907e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch \
python3.11dist-liblarch \
python311-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python311-gobject"

inherit rpm
