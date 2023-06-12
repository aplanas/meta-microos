SUMMARY = "Documentation for texlive-screenplay-pkg"
DESCRIPTION = "This package includes the documentation for texlive-screenplay-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-doc-2023.201.1.1svn44965-53.1.noarch.rpm"
RPM_HASH = "be65447ed744e46306f397efc910db9e3b24e3cafc02b623a815032e53f265c763d4e97d12afe74f8cdf1b67e6f8d77e852b7bac3a7af318c925a040e6f70aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-pkg-doc"
RDEPENDS:${PN} += ""

inherit rpm
