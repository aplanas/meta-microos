SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python311-scikit-sound-0.2.3-3.11.noarch.rpm"
RPM_HASH = "0ad1e307712a65d53df55caa1ae96a082d335a3a5bc5deed8e3443e18574f8d4ab2f900305301ccc84fb5cae71d08a4d8c993fa6a8a1c2b4fedca5b7dee786c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-sound) \
python311-scikit-sound \
python3dist(scikit-sound)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-appdirs \
python311-docutils \
python311-pygame \
python311-scipy"

inherit rpm
