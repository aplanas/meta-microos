SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python310-yamldoc-0.3.0-1.15.noarch.rpm"
RPM_HASH = "82085cb8d58984d8338a0fba31bddfc6b163088f38bf3c6fc3ee9e2526aa03a6e1cd2b818c609dc6e1d6b9e136ef2735baed51063c6640c0301e0ebed7f609c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-yamldoc \
python310-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
