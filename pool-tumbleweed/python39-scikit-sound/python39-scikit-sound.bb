SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python39-scikit-sound-0.2.3-3.13.noarch.rpm"
RPM_HASH = "e01be1afbdfb04d4030ca0f271927ea5214fe76387d60ae1535d6c8c2b54be5e22a112f53d7d1b0413feb94bc343342455b578e08a33fa51bf3cc779d2b3bb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-sound \
python39-scikit-sound \
python3dist-scikit-sound"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-appdirs \
python39-docutils \
python39-pygame \
python39-scipy"

inherit rpm
