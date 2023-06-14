SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-docopt-0.6.2-7.17.noarch.rpm"
RPM_HASH = "7d06034b8c08eedb9992a55437dc27ee9375d645fd331b0d68a911240a05c0ba0158db1f974434e889d8651be45991a70ef140e0afc51b92a6cfb4989720dc9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docopt \
python3.10dist-docopt \
python310-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
