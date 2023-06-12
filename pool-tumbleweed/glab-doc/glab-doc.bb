SUMMARY = "Documentation for GLab"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "glab-doc-1.30.0-1.1.noarch.rpm"
RPM_HASH = "58d103b276806de424636587a9d81409793652ee39e918aa1a8b79b7cbfedab1209cca746ce378bbb7c591305e85a39a42ae0d2e8c82277dc7b0237bd8c4302e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-doc"
RDEPENDS:${PN} += ""

inherit rpm
