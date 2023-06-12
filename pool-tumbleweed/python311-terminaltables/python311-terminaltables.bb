SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-terminaltables-3.1.0-2.15.noarch.rpm"
RPM_HASH = "e90199f81d0533ab7767f915b9ecfd79470d209f367cea228f28449011f26fadb286c42c0bdbe9656acf06b2759b26363b7c28874b3cd42eb31f1196ef546c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(terminaltables) \
python311-terminaltables \
python3dist(terminaltables)"
RDEPENDS:${PN} += "python(abi) \
python311-colorama \
python311-colorclass \
python311-termcolor"

inherit rpm
