SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python39-jupyter-core-5.3.1-1.1.noarch.rpm"
RPM_HASH = "0e8d00413d62062906a7b07c68028c72e402fd016d4f94e80dea749901bdd560c444cb3373e8146cc16c960ecd6d282801b2749591ccadb3d358f4034f64c66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-core \
python39-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-platformdirs \
python39-traitlets"

inherit rpm
