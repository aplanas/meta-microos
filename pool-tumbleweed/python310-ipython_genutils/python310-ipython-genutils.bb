SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-ipython_genutils-0.2.0-3.11.noarch.rpm"
RPM_HASH = "5971841f19e18b20e81d718ff8e65ec26b5c9057c49848ff88b0fb03a15b8a609ef896355754025de1221f48a02a7b4774000e2d4dc698dcfea91e9ea7a1497d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipython-genutils \
python3.10dist-ipython-genutils \
python310-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-pytest"

inherit rpm
