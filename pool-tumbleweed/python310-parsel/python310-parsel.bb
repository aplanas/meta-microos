SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python310-parsel-1.7.0-1.5.noarch.rpm"
RPM_HASH = "2d47d3e48c7fecbaa2805bcffd3edffc1cc95515b8cb8b25d4ee24b98edbd093fffb45b8746143c750a3cd0bab449524f7fe15a61883362b73856ab4c26a5cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parsel \
python310-parsel \
python3dist-parsel"

RDEPENDS:${PN} += "python-abi \
python310-cssselect \
python310-lxml \
python310-w3lib"

inherit rpm
