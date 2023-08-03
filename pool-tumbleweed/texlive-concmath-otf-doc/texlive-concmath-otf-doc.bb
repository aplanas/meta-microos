SUMMARY = "Documentation for texlive-concmath-otf"
DESCRIPTION = "This package includes the documentation for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-doc-2023.209.0.0.25svn65683-54.1.noarch.rpm"
RPM_HASH = "28e36201a55eddc7aebb35ccf5fcfe61845e43ae411aeebe39105cf1300cf5f20901f6c0d11005a19c2db8c12a6bc9cfff0b4eabaa367e7559c963a9bdbc4265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
