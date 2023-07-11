SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-pastel-0.2.1-2.1.noarch.rpm"
RPM_HASH = "c11d513ece897066583bd2891e0434bab04c33b69997ac37843e4d9567fd019f6f8a240e12fc22cae48f0a93d508de16c59b47df909ee40295e92f4d33972e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pastel \
python39-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
