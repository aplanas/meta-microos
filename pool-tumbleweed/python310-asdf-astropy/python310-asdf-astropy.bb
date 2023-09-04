SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-asdf-astropy-0.4.0-1.4.noarch.rpm"
RPM_HASH = "30e478b306c575d3653a78843777788fa1260ab1049900aff7483d46f1daefb6cce96e2e89e1edda99932d4769f312aab8aa1d7298e37b73e454192f55357008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-astropy \
python310-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python310-asdf \
python310-asdf-coordinates-schemas \
python310-asdf-transform-schemas \
python310-astropy \
python310-numpy \
python310-packaging"

inherit rpm
