SUMMARY = "Documentation for texlive-multirow"
DESCRIPTION = "This package includes the documentation for texlive-multirow"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8svn58396"

RPM_NAME = "texlive-multirow-doc-2023.201.2.8svn58396-54.1.noarch.rpm"
RPM_HASH = "0ba6da9ee642145a200af694d1e2a65e16cd3086237d52055cee3e3efe5bc7798b2103551bbc37df716f0588d2bb95db4909df15d649b7eddf49374aa102f2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multirow-doc"

RDEPENDS:${PN} += ""

inherit rpm
