SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-babelfish-0.6.0-1.9.noarch.rpm"
RPM_HASH = "5874ee3091e245ee9786c2796f0c5c9206e3b1de9c7f478982a982b13b97738328c40866feae6edb2dcd0ec5c33e999fb79ad81723e770f8efae9bac603adaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-babelfish \
python39-babelfish \
python3dist-babelfish"

RDEPENDS:${PN} += "python-abi"

inherit rpm
