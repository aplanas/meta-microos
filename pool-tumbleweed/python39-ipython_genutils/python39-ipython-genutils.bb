SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-ipython_genutils-0.2.0-3.11.noarch.rpm"
RPM_HASH = "fb850037ecdb0a15689d152c566ad8b053ee2ad2c828ce9eb9dbc0841c6df0e0be2b11931227ec1d9435d573c112ff2053a7cc95326fc859ce47b4fa0df8622f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipython-genutils) \
python39-ipython_genutils \
python3dist(ipython-genutils)"

RDEPENDS:${PN} += "python(abi) \
python39 \
python39-pytest"

inherit rpm
