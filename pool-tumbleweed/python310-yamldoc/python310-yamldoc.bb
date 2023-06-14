SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python310-yamldoc-0.3.0-1.14.noarch.rpm"
RPM_HASH = "05e0ef95253c071762baefca2d93cfd2e2bb3ad3103166cc12ed331bd622c9a5d56ccafcd3b0c520ba6ecf1a710436be5c56cc8bdc1e254e6de9ebc2c7aa809a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamldoc \
python3.10dist-python-yamldoc \
python310-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
