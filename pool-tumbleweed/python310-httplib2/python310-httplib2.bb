SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python310-httplib2-0.22.0-1.2.noarch.rpm"
RPM_HASH = "3f3c1a2845bc81d6812a288eb76ca1af8f0f965f42f911ed598b9b584d4c208b3eae9a4812ebb4fe44b65c4b04d953032b466334305a8afef6c53eb646bd68d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httplib2 \
python3.10dist(httplib2) \
python310-httplib2 \
python3dist(httplib2)"

RDEPENDS:${PN} += "ca-certificates \
python(abi) \
python310-certifi \
python310-pyparsing"

inherit rpm
