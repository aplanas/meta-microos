SUMMARY = "Documentation for texlive-enumitem"
DESCRIPTION = "This package includes the documentation for texlive-enumitem"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9svn51423"

RPM_NAME = "texlive-enumitem-doc-2023.201.3.9svn51423-53.2.noarch.rpm"
RPM_HASH = "db9e7c23d6514adae938fd4fa8f8600d4db89c1b4e07cc1705ee116e88b5fdf313542bcc3b8a5c9fc407d805611a1f79448fd2b901cbfb330da49fee2ec093f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
