SUMMARY = "Documentation for texlive-changes"
DESCRIPTION = "This package includes the documentation for texlive-changes"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2.1svn59950"

RPM_NAME = "texlive-changes-doc-2023.201.4.2.1svn59950-52.1.noarch.rpm"
RPM_HASH = "a1f1bfa1d6414cc98bc55c4c79a7906ce7c5eb1c44616e81c73928ac9f50bd4f2f0c0bcabd71aa793fa26ef37f10f48865b7eefa1c50262b39651479a7dd0fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-changes-doc:en;de) \
texlive-changes-doc"

RDEPENDS:${PN} += ""

inherit rpm
