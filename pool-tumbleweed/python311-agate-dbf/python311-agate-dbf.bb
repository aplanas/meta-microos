SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-agate-dbf-0.2.2-1.10.noarch.rpm"
RPM_HASH = "112b93058fa82ef8c62d6b1b5f3be5ae607235d527695053d8d69ee70949babf3d512b95f78682d41c83999c3e1bddbad5113c8fcec6bfe0321207e1f17ed141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-agate-dbf \
python311-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-dbfread"

inherit rpm
