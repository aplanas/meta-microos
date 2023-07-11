SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python39-liblarch-3.0-2.17.noarch.rpm"
RPM_HASH = "e101d030c4c89dfed1de13a2748c273e3b50a9c67af07c7d2adac7cb3699e01e2c94155a37c3ad7ea18a3ac4bbb465c59d310a5a5ef886a31df3767aa40dde95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-liblarch \
python39-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python39-gobject"

inherit rpm
