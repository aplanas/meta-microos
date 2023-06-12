SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-termcolor-2.1.1-1.3.noarch.rpm"
RPM_HASH = "10ec0e43dbc70423b70cda10f1e8fcf7164da92881e95eb47c0a89d54a79abb53887ad394a75448f07155cf6880295057036c1cd7a70a84f34b8a2a0c3b28b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(termcolor) \
python311-termcolor \
python3dist(termcolor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
