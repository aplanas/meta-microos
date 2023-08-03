SUMMARY = "Documentation for texlive-newvbtm"
DESCRIPTION = "This package includes the documentation for texlive-newvbtm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn23996"

RPM_NAME = "texlive-newvbtm-doc-2023.209.1.1svn23996-55.1.noarch.rpm"
RPM_HASH = "904411f89d3d02470ebb180e7965444948e436349956c64e76a79baf1f53b1e8dd686449a0744f8cb6d88131b276a849c72f8e7f4e29251153368ff439e126b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newvbtm-doc"

RDEPENDS:${PN} += ""

inherit rpm
