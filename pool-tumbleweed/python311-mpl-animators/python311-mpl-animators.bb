SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-mpl-animators-1.0.1-1.8.noarch.rpm"
RPM_HASH = "5f2c1b5e0c213f8c0ff9696ca94cc001dedfba0f44ecacbc03d4bffc26b6efbe1a0c824efa281770f036c0235d3fdb93ef69dae31f61fc5df947cc3cd61cc5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpl-animators \
python3.11dist-mpl-animators \
python311-mpl-animators \
python3dist-mpl-animators"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy"

inherit rpm
