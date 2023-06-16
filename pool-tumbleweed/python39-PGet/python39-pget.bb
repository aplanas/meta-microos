SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-PGet-0.5.1-1.9.noarch.rpm"
RPM_HASH = "2fd616f8d8b2217b5403783a47c796857b83eb3b0a3d90edb08984478e7928509667cdda1abca522c21bee34b8d9d331d33ea304dae9bca7893a08e0a460d66a"
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
