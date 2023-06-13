SUMMARY = "Documentation and examples for python311-watchdog"
DESCRIPTION = "This package contains documentation and examples for python311-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-watchdog-doc-3.0.0-1.2.noarch.rpm"
RPM_HASH = "6bd5f955d6f35ba4fc857dfa6ec0b20e948cb1a27261048cdb02e203f82496c751a9a298b4ea9e489ddff57258efbaea7191351975319738e9a4a63f7cb7e7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
