SUMMARY = "Documentation for texlive-bbm"
DESCRIPTION = "This package includes the documentation for texlive-bbm"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-bbm-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "7f5630361307a80105e524fde4657423deee44c46a8988459b9699d17cd245ec1fff95c548b5464e24056a26369ba6e94a295d277b2b53eec234a7cf163f14b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-doc"

RDEPENDS:${PN} += ""

inherit rpm
