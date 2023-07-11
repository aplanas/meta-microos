SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-docopt-0.6.2-8.1.noarch.rpm"
RPM_HASH = "b8985bb8307357d640c9fd32cb0ae536779c9f0259741ad88bb67c660760db05c23d238aef4f2cf1fd2947dc270f7bf84a23e767c3e6ca983956bf026748c438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docopt \
python310-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
