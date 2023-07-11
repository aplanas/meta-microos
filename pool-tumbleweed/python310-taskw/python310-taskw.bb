SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-taskw-2.0.0-1.5.noarch.rpm"
RPM_HASH = "283f23dda783f41f7b1d1d1893a7172b492a38adf388add3cbef3b73fb4f10918ceb329dbe8a45607e8366dc41eff8135de0f8c4d7e37246eb2e44e0e395591a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-taskw \
python310-taskw \
python3dist-taskw"

RDEPENDS:${PN} += "python-abi \
python310-kitchen \
python310-python-dateutil \
python310-pytz \
taskwarrior"

inherit rpm
