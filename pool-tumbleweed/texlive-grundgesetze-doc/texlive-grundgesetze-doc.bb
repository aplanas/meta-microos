SUMMARY = "Documentation for texlive-grundgesetze"
DESCRIPTION = "This package includes the documentation for texlive-grundgesetze"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-doc-2023.209.1.03svn58997-54.1.noarch.rpm"
RPM_HASH = "b049f791a2e016af9c85060f059812b9bbd7c3a80a9ca9ecfea144e2a076650661e02295617cf504f530aa7c85b53794eba068a573ce1809ecbd105716b552c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grundgesetze-doc"

RDEPENDS:${PN} += ""

inherit rpm
