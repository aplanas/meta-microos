SUMMARY = "Documentation for texlive-datetime2-turkish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-turkish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-doc-2023.201.1.1svn52331-52.1.noarch.rpm"
RPM_HASH = "2522a7e4074e2b69218ecfed4bd1f5e6ec2ec611435e0422a13bcfb0776701eab6317586e49c7fc4d7ea6ec47425a059b7831e13f27ccf60699d73b846337c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-turkish-doc"
RDEPENDS:${PN} += ""

inherit rpm
