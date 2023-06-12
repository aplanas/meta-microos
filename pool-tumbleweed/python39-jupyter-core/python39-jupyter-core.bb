SUMMARY = "Base package on which Jupyter projects rely"
DESCRIPTION = "Core common functionality of Jupyter projects. \
 \
This package contains base application classes and configuration inherited by \
other projects. It doesn't do much on its own. \
 \
There is no reason to install this package on its own.  It will be pulled in \
as a dependency by packages that require it."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python39-jupyter-core-5.3.0-1.2.noarch.rpm"
RPM_HASH = "5fc0c7a4fd1a832d19e49bfc72399de4488ea9fc3d4fb378ba28f9f455bfe1f703b3e5f35cf0f5dc83da8ef323e5933bf4b3990bd5961bfbd3955006e17b8bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-core) \
python39-jupyter-core \
python39-jupyter_core \
python3dist(jupyter-core)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-platformdirs \
python39-traitlets"

inherit rpm
