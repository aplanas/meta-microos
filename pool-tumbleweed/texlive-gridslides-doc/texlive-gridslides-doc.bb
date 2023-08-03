SUMMARY = "Documentation for texlive-gridslides"
DESCRIPTION = "This package includes the documentation for texlive-gridslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-doc-2023.209.0.0.1.1svn54512-54.1.noarch.rpm"
RPM_HASH = "abeef404f89879ed42645d34be978f1fea24655d54619dd21d88c6e05d205e790ae2aab94b2c4fb5d50d7b75ddc1355fc1b9b4762080b810e8d4f8feb7b57916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridslides-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
