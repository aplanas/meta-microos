SUMMARY = "Documentation for texlive-grundgesetze"
DESCRIPTION = "This package includes the documentation for texlive-grundgesetze"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-doc-2023.201.1.03svn58997-53.2.noarch.rpm"
RPM_HASH = "6541ee5f8ef8cc5fdace42ba0308e9238b19a162464db8d2676d1cb3aafe71b74e1020e179acd8679a482b96abc1dce8824f868ed5e2be8060b484d29a710285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grundgesetze-doc"

RDEPENDS:${PN} += ""

inherit rpm
