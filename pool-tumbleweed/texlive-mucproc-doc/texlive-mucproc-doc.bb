SUMMARY = "Documentation for texlive-mucproc"
DESCRIPTION = "This package includes the documentation for texlive-mucproc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn43445"

RPM_NAME = "texlive-mucproc-doc-2023.209.1.02svn43445-55.1.noarch.rpm"
RPM_HASH = "d657718c49607dc0e06520b6c623f7f69e672e7fe6efd38e56e44a753105a4e4d3789cc2f11ba7f59295f116ea2b41a90602065480a71157489f19c1afa655f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mucproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
