SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python39-Trololio-1.0-3.15.noarch.rpm"
RPM_HASH = "0fdf3fd72bfe2ad80678730f6dcc16670175f5bd1f23c1381a78e735f302841b51b6d045ccd2cfdf414b14e97d3384e5e1f4365c3e90f1f8e44b7730d445f286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trololio \
python39-Trololio \
python3dist-trololio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
