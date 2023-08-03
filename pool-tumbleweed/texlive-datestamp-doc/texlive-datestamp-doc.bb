SUMMARY = "Documentation for texlive-datestamp"
DESCRIPTION = "This package includes the documentation for texlive-datestamp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-doc-2023.209.0.0.3svn61719-55.1.noarch.rpm"
RPM_HASH = "bfb3e3c5dd7ba3892fc898b1dddf69a1e6174a086988916cb0777a66b1ab3d1c3fed168b0e5e5bc757e9011538b2797dc345580f7fc185b576343f1ec04f94b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datestamp-doc"

RDEPENDS:${PN} += ""

inherit rpm
