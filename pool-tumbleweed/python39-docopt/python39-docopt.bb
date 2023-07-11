SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-docopt-0.6.2-8.1.noarch.rpm"
RPM_HASH = "7fd9c055f1d29499cf29f5a408435c5c530fee7388f09d18e36cb5222555fb16189a4b7b8ec7219a4d3f074aaaf0d10c9162980bd7016cb8ee3f5a562097260b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docopt \
python39-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
