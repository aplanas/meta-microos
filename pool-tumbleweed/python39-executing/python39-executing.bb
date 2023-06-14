SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-executing-1.2.0-2.1.noarch.rpm"
RPM_HASH = "1b9977adce0414f12f13d6235a74a614469bb5f24087ea659fd7030fac2ca909c14872753a687b3b7cce55fa41c7546535331e51a09fc167ac17be44165c4875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-executing \
python39-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
