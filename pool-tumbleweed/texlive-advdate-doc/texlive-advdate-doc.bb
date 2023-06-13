SUMMARY = "Documentation for texlive-advdate"
DESCRIPTION = "This package includes the documentation for texlive-advdate"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20538"

RPM_NAME = "texlive-advdate-doc-2023.201.svn20538-54.1.noarch.rpm"
RPM_HASH = "ab80bfef97e4b4a57809709afd3be4994d91705d9590042fb55d15cbbff548e8efbe365e00e0611a5da12bf6e37b6f6fb06511e9d80b0f031fc24f499b992a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-advdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
