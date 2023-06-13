SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python311-Trololio-1.0-3.14.noarch.rpm"
RPM_HASH = "e227a8f62c8952216773ad554ac97810f2b7487f3d35e2ee19892a57028f03c6a4f1ff79ecc2491c549c4846315df2fde6b1043188747e85316bf7a46da4d1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trololio) \
python311-Trololio \
python3dist(trololio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
