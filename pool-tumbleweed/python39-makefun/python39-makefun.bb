SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python39-makefun-1.15.1-2.2.noarch.rpm"
RPM_HASH = "1fa5d0feafc999965c0d85befaf6f04e998e4d10724ccf78ff73ed0a6a69e0aa8a0f96dee961b36601150a26c45df83fec403787a30aa8d79592752cc10a8776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-makefun \
python39-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
