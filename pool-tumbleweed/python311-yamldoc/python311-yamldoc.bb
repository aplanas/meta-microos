SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python311-yamldoc-0.3.0-1.15.noarch.rpm"
RPM_HASH = "bb9872e27dbf7e2428943d1d2b30c9e19050e078a0c51463aae1ff1792be4305e3b3d20f789b75c03065da6ba12a2014da08a7003c1fa57c683fe3bd0e07ea40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamldoc \
python3.11dist-python-yamldoc \
python311-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
