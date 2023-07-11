SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-pastel-0.2.1-2.1.noarch.rpm"
RPM_HASH = "3198a94914c69eec0134c298df0474699b2f8488453519fb73700d255859983fe4a47c6daf25207318525ca41b4c67570f0a59587eb491ab2b61fe1232a6e41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pastel \
python310-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
