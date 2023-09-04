SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2023.20230311.svn53999-93.2.aarch64.rpm"
RPM_HASH = "eca1f69666c33e3ce1d2358ae1203d8c28831a6aa5795b4b7b179f44e6af791461e0718d4847b46d344e2c3738a107563f69ea00f0fb0c71a74d4e14fd9df8e4"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin"

RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm
