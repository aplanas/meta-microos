SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python39-jsonpointer-2.3-2.2.noarch.rpm"
RPM_HASH = "b7c7b49fe9e81c5930ba007ef9e3c7f42424ab061fa1b8a237882d2713343130e502088abb9f589e5d405de4a5447514091ea37fca9e393714d521dbeddb3c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonpointer \
python39-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
