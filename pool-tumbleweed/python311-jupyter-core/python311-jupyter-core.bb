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

RPM_NAME = "python311-jupyter-core-5.3.1-1.1.noarch.rpm"
RPM_HASH = "29b053507a4ed89a77808b23a3f0dc8c6dc44446202be5e9c319407a0eb5fcad273827ce5c6094f67741aba88d2848ea3ad683b85662d696a7b5e8d5c6922eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-core \
python3-jupyter-core \
python3.11dist-jupyter-core \
python311-jupyter-core \
python3dist-jupyter-core"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-platformdirs \
python311-traitlets"

inherit rpm
