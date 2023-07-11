SUMMARY = "Documentation for Xindy"
DESCRIPTION = "Documentation for the Xindy index generator."
LICENSE = "GPL-2.0+"

PV = "2.5.1"

RPM_NAME = "xindy-doc-2.5.1-2.27.noarch.rpm"
RPM_HASH = "f8e45921b8e2e19c891dde54c147789c600e0ec97a30b8ef2d192d17c139036a54762c270d17d12cae8fda49dc333ce796eccc15bbd6bc5a39242b87006da8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xindy-doc"

RDEPENDS:${PN} += ""

inherit rpm
