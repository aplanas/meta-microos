SUMMARY = "Extra scripts for bat"
DESCRIPTION = "Bash scripts that integrate bat with various command line tools."
LICENSE = "MIT"

PV = "2023.03.21"

RPM_NAME = "bat-extras-2023.03.21-1.1.noarch.rpm"
RPM_HASH = "b6013176e21dab2eaa5fd23563c717f72984441fb9137f8f410ddf80501bf9824af6f76cb9f2a6f058d53a028f275b2b2c8bb2f45727e13daf14dbae29d9b1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-extras"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
bat"

inherit rpm
