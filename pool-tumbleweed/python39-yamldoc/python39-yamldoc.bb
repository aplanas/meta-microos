SUMMARY = "A module to determine file mimetypes"
DESCRIPTION = "This module is a layer on top of the standard Python mimetypes module and \
python-magic. Python-magic only works with local files to which you need to \
have access, while mimetypes only uses the filename to determine its \
filetype."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "python39-yamldoc-0.3.0-1.15.noarch.rpm"
RPM_HASH = "8fb63bd2a3847e4b24af7b5618a68d523de84eaa2f70e2e0189b4e2491bc164a2f31a997f69bb1e48a771b81d773ce05e70c14622fd25533f612b497d622b346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-yamldoc \
python39-yamldoc \
python3dist-python-yamldoc"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
