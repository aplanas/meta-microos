SUMMARY = "Documentation for texlive-ipaex"
DESCRIPTION = "This package includes the documentation for texlive-ipaex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-ipaex-doc-2023.209.svn61719-56.1.noarch.rpm"
RPM_HASH = "0470b6a19d2f44c13a936e1ddb939b4ae2afb747f8090ade557560ab0f3ee65f8364cbb2b869a1c67631f85ac41f45bc723b0cef58fd3ad3b170089864cdf237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex-doc"

RDEPENDS:${PN} += ""

inherit rpm
