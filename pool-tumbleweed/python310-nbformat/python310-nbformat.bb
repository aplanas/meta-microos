SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.9.2"

RPM_NAME = "python310-nbformat-5.9.2-1.1.noarch.rpm"
RPM_HASH = "25e4cfb894238cd3ce1bb5e1e335c5b785f2dad18a61bc1aaade00373b6df38d9735b425c304279f3dbea4660a72cdfd2c06ecb9814c1eb603dc3a6da59f3389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbformat \
python310-jupyter-nbformat \
python310-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-fastjsonschema \
python310-jsonschema \
python310-jupyter-core \
python310-traitlets"

inherit rpm
