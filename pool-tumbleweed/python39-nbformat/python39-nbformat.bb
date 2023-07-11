SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python39-nbformat-5.9.0-1.3.noarch.rpm"
RPM_HASH = "f6e8db40f63a0e3efc044b9ddad9813c0bde6bb4a82709122715636bd41109ca92b3084591864c54841d7333d821307f257250e55957810402212e0779a59941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbformat \
python39-jupyter-nbformat \
python39-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-fastjsonschema \
python39-jsonschema \
python39-jupyter-core \
python39-traitlets"

inherit rpm
