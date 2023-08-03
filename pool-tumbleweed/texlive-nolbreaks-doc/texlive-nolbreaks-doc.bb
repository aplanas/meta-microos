SUMMARY = "Documentation for texlive-nolbreaks"
DESCRIPTION = "This package includes the documentation for texlive-nolbreaks"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn26786"

RPM_NAME = "texlive-nolbreaks-doc-2023.209.1.2svn26786-55.1.noarch.rpm"
RPM_HASH = "a9b40cdf72847e43a39be9fedee037d0420c8187a882c1188716c8e39d6689039c633b49480b3527d568c7efdcc43f1e88ff3e6884ce21be84bbfa598fd8304d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nolbreaks-doc"

RDEPENDS:${PN} += ""

inherit rpm
