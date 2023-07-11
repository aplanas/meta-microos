SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python39-easy-thumbnails-2.8.5-1.6.noarch.rpm"
RPM_HASH = "a7ea4b4b011cb70cccdb56139e0a42a8703729cc74984a50ce4dbcd198d7a570ece3d8cee0fe3ccbf8aa4cb5e6c70002adeddb44a45ea575afa05dba2ba49691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easy-thumbnails \
python39-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Pillow \
python39-lxml \
python39-reportlab \
python39-svglib"

inherit rpm
