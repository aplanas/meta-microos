SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python39-vistir-0.8.0-1.1.noarch.rpm"
RPM_HASH = "cfa95f898f3fc5fd054e7b5587462e1a18d742b50fc595c702fcbc0bb208ade7941ca97ec3d129aa05c249464634de0c90a2472a86aad964be53584239ac2b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vistir) \
python39-vistir \
python3dist(vistir)"

RDEPENDS:${PN} += "python(abi) \
python39-colorama"

inherit rpm
