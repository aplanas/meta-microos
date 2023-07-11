SUMMARY = "Documentation for texlive-refcount"
DESCRIPTION = "This package includes the documentation for texlive-refcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn53164"

RPM_NAME = "texlive-refcount-doc-2023.201.3.6svn53164-53.2.noarch.rpm"
RPM_HASH = "5136f9e723fae5c7329ea96937fa9fa2963efcc9e2dfd76c21f41b87790fb94839de682dc648190f69372f0368af8acd722f07b5f875ac33e517bcb1b22cddc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
