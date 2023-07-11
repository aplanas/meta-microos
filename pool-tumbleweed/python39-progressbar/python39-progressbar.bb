SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python39-progressbar-2.5-3.1.noarch.rpm"
RPM_HASH = "bca9dd46fd3a8b4c2e9b3451257e0d7e1bd0f4fd1f7296f6977128b962a684c9a1ee7b6881aad279b85076d1e8e5e05b09ca903ed4e31a06d0e9ea5980124c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-progressbar \
python39-progressbar \
python3dist-progressbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
