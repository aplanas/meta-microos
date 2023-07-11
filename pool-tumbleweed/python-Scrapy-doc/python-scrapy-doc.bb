SUMMARY = "Documentation for python-Scrapy"
DESCRIPTION = "Provides documentation for python-Scrapy."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python-Scrapy-doc-2.7.1-1.7.noarch.rpm"
RPM_HASH = "19cbee21a400ab31d26aaa27958df9b5ebc991ae59693664a8bd60c02f46869a0c2e83b63d605d7f9c60710143eeaf009130d88d126ab0921914c1790bfbe3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Scrapy-doc"

RDEPENDS:${PN} += ""

inherit rpm
