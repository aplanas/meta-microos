SUMMARY = "Library and development files for handling X-Face data"
DESCRIPTION = "These files are needed when building software that uses the Compface \
library."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "compface-devel-1.5.2-158.27.aarch64.rpm"
RPM_HASH = "74180d451e1ed7701a75ae9a45c2ef2b40b6a6fbbd6159ab24181348b631e331281fa188c658b50872d1fbe10f4cef04b0b347b4d2cd77d34917f7fb49962ec1"

RPROVIDES:${PN} += "compface-devel compface-devel(aarch-64)"
RDEPENDS:${PN} += "compface"

inherit rpm
