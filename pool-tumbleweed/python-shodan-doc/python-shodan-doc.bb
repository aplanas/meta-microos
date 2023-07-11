SUMMARY = "Documentation files for python-shodan"
DESCRIPTION = "HTML documentation on the API and examples for python-shodan."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python-shodan-doc-1.28.0-1.6.noarch.rpm"
RPM_HASH = "e13c75c5ebd869cdb7a8d038ceb3a5080ecaeb0264eb177ed421c6c71cd51540d3a9aa3ab19330d87b42ba58e5717bb9eaf196c19e740bc615ba7c78db10bcce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-shodan-doc \
python310-shodan-doc \
python311-shodan-doc \
python39-shodan-doc"

RDEPENDS:${PN} += ""

inherit rpm
