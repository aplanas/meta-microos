SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python311-Trololio-1.0-3.15.noarch.rpm"
RPM_HASH = "125654b5a7f320eb08413e9cfdfd64b0032e3ec811fa1248c68c0e2fda43e6bb52ced5461b64c28aa718744854216a4f3dee2312bba94923efb3e6134aed42d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Trololio \
python3.11dist-trololio \
python311-Trololio \
python3dist-trololio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
