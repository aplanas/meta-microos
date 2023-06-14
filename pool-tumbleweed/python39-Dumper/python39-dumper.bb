SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-Dumper-1.2.0-2.6.noarch.rpm"
RPM_HASH = "8fd1e6a8c4ca8bab8ea8c2ba3323d4326eb987ad540321c5b619da8dbf9a1b3e4e8e1153eb4bad64003ca86c3767ea277942073e344279b36b9c4d818c96e412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dumper \
python39-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
