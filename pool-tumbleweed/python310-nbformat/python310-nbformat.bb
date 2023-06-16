SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python310-nbformat-5.8.0-1.2.noarch.rpm"
RPM_HASH = "29f95b3a83ff0579483965b3076849e3a2551d16c11c22a6cdf833b7b8e69fb1a7eb7310afb70017a0bd76fb0870e8ddb8a8f75d26591d43252bcd0dd5dcf8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbformat \
python3-nbformat \
python3.10dist-nbformat \
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
