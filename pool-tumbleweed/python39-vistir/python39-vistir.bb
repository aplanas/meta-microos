SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python39-vistir-0.8.0-1.3.noarch.rpm"
RPM_HASH = "58e970941062c83904c4bf525e361b243f8efe8c750aad7926c16f9fefb3f2474c9f0c0977388ced60c7ccd07e78d7107d5ab8b57ab7c553a4c0c7205df286b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vistir \
python39-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python39-colorama"

inherit rpm
