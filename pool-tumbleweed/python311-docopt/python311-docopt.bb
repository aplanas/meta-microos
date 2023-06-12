SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-docopt-0.6.2-7.17.noarch.rpm"
RPM_HASH = "8a75d951afe876403b9f39d4dade47ef3ab390d17aa770faf514d968d088dbc36d570cc6f2e3b26c3612d08aa68c117b46b31579eca326cab90f1f69c1a8c461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docopt) \
python311-docopt \
python3dist(docopt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
