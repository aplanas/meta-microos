SUMMARY = "Documentation for texlive-tcldoc"
DESCRIPTION = "This package includes the documentation for texlive-tcldoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.40svn22018"

RPM_NAME = "texlive-tcldoc-doc-2023.209.2.40svn22018-55.1.noarch.rpm"
RPM_HASH = "e3c408eb28c687fb262527be0c04917da94abe3bb3328fe5353ccd2c833e2591177b9f7a2725cb0970f49244132383da9549361cb6283701de1f8fd27a2714bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
