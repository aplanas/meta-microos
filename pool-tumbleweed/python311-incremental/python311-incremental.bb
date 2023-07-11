SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-incremental-22.10.0-2.2.noarch.rpm"
RPM_HASH = "3f210ab6ed501a6a3a456262c134533d5985a03870e1fd56898321022bacb0b8ed73de1385347b25fab34a78e4fa1f5bfe9ec5ad2fd2288bd4b61fd87befdd2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-incremental \
python3.11dist-incremental \
python311-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi"

inherit rpm
