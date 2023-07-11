SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-pydyf-0.6.0-1.3.noarch.rpm"
RPM_HASH = "4a3acd6ec23263b777877a547dd352d60b5d7b3ce411fb1a8e0c1ea3924c133cc806c0fcba8285581a96b3632f344e54ae69ad128b04abef5d4d75ecb4676940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydyf \
python310-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
