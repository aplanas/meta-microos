SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python311-scikit-sound-0.2.3-3.13.noarch.rpm"
RPM_HASH = "e0a3306ebac4b71d23cedbbdee1b4c5916ba69dcec4f59d928778a6402230e7172dbfb72a4d06aa7fb54da52c0ba62c3d4bbc8b8b5b4fd5c8825fa69a276bafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-sound \
python3.11dist-scikit-sound \
python311-scikit-sound \
python3dist-scikit-sound"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-appdirs \
python311-docutils \
python311-pygame \
python311-scipy"

inherit rpm
