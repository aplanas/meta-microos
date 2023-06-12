SUMMARY = "Documentation for texlive-srbook-mem"
DESCRIPTION = "This package includes the documentation for texlive-srbook-mem"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn45818"

RPM_NAME = "texlive-srbook-mem-doc-2023.201.svn45818-57.1.noarch.rpm"
RPM_HASH = "36ad8da4ff862739b03290a869e170831ef30e52f09c5598624570289e582fd6934cfe70dee01ea7beef911f955de99e2599e86552f91d441d59da8486741673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbook-mem-doc"
RDEPENDS:${PN} += ""

inherit rpm
