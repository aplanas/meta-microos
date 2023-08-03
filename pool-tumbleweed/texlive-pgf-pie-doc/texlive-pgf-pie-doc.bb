SUMMARY = "Documentation for texlive-pgf-pie"
DESCRIPTION = "This package includes the documentation for texlive-pgf-pie"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-doc-2023.209.0.0.7svn63603-52.1.noarch.rpm"
RPM_HASH = "77b5e4f75eac04b0053d02c83138fced8dad8d2bac077231c08ce480f2aa3bd294493b376deb0fad0f8b7556bc878d0c5964c46f651395f0f39e9b162bb83bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-pie-doc"

RDEPENDS:${PN} += ""

inherit rpm
