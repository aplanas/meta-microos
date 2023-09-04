SUMMARY = "Documentation for texlive-grundgesetze"
DESCRIPTION = "This package includes the documentation for texlive-grundgesetze"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-doc-2023.209.1.03svn58997-54.2.noarch.rpm"
RPM_HASH = "71aeca01ffaa8cd65a3bceb3d8617c994c80ea5722b7fd53458c370d8d486d0770221dced026ee12c47d546088a8cf2c39d705d7a7c04d17c1c33aaec5e00b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grundgesetze-doc"

RDEPENDS:${PN} += ""

inherit rpm
