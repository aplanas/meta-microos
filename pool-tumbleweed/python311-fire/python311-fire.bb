SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python311-fire-0.5.0-1.5.noarch.rpm"
RPM_HASH = "860264a03f2f6fd974337a103d0c40d1fe33a7775ec7d9f93948ce937d5011cc26b0e42a19718b20a7c55ae01e9807f4668c67db11d4552a0e1963e5f081cad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fire \
python3.11dist-fire \
python311-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-termcolor"

inherit rpm
