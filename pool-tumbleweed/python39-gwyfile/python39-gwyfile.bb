SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-gwyfile-0.2.0-2.11.noarch.rpm"
RPM_HASH = "afda7c64e2b25cf28b8f484f28b04a8c8ee65d76a359d4299f6f6c3d8706ce55a2108018a32ba6ac69a594d6b42059c35a4934517364a85155267cdaf53a9acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gwyfile \
python39-gwyfile \
python3dist-gwyfile"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-six"

inherit rpm
