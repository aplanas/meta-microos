SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-docopt-0.6.2-8.1.noarch.rpm"
RPM_HASH = "edcf59f85990f84937bd09f41e49013d14295eea813e0aeb1215fe047491913bbbbf440b36791e5146644b220766533db1af76587cbab9b53b88a3067457aab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docopt \
python3.11dist-docopt \
python311-docopt \
python3dist-docopt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
