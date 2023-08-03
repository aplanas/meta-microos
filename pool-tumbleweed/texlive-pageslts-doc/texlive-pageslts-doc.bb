SUMMARY = "Documentation for texlive-pageslts"
DESCRIPTION = "This package includes the documentation for texlive-pageslts"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2fsvn39164"

RPM_NAME = "texlive-pageslts-doc-2023.209.1.2fsvn39164-52.1.noarch.rpm"
RPM_HASH = "2b06e5bec953e194f4da0203ec731c8f481fe7173c369182efc1260e95921ecbbfdabd7e14a2be05a21ef7351c0e0d39134f793c94b95a02626dfd9b98ab6b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pageslts-doc"

RDEPENDS:${PN} += ""

inherit rpm
