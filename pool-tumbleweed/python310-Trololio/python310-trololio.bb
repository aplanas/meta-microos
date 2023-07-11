SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python310-Trololio-1.0-3.15.noarch.rpm"
RPM_HASH = "caad03d3be880aab7457609b0de2526d44fbb2f9d428fca3597437c6a79c32223fe38fb82a584d9736536d51a06d29e9074ff060e4ee9d79b9b61d84463885f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trololio \
python310-Trololio \
python3dist-trololio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
