SUMMARY = "Documentation for texlive-theanooldstyle"
DESCRIPTION = "This package includes the documentation for texlive-theanooldstyle"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64519"

RPM_NAME = "texlive-theanooldstyle-doc-2023.209.svn64519-55.1.noarch.rpm"
RPM_HASH = "95fa1e6046a1c6379ea965188047869c3a097f0a2ebb4b8527601e9d9ecba88658abaf7c4e34a8c2312ff8fd52e780ca2420857dc9b89491b5b16c093c891a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanooldstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
