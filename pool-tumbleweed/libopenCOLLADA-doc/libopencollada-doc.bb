SUMMARY = "Developer documentation for openCOLLADA"
DESCRIPTION = "This package provides documentation for openCOLLADA."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-doc-1.6.68-1.13.noarch.rpm"
RPM_HASH = "1aabc1961cead5ebd3a24c96cbc6aaed604d906075d064ba7ab2918c6b8a03e607011f69946894ef85dd36518698e68bf3b0cf7bd45d527d6c8f9ea4ae9c4fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenCOLLADA-doc \
openCOLLADA-doc"

RDEPENDS:${PN} += ""

inherit rpm
