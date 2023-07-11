SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-PGet-0.5.1-1.11.noarch.rpm"
RPM_HASH = "6d15e39bb6a27bc80f11c22e6075d9cd2aa7f57bc12933e3fbfe4ed0f328ad42ef775d3902e14aa2a88217ca31d4984a9024154f4ddc5f9c81f83d2646a8af4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pget \
python39-PGet \
python3dist-pget"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
