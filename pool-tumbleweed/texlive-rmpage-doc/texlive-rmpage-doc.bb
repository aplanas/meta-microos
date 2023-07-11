SUMMARY = "Documentation for texlive-rmpage"
DESCRIPTION = "This package includes the documentation for texlive-rmpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-doc-2023.201.0.0.92svn54080-53.2.noarch.rpm"
RPM_HASH = "cd1fb9eb0b345e898d93a9ce8950e521c4485438f993e0477812b2a99ff15e805e373d4985a6cd01064775681397284ad82587e3aea452a248cbe2804579b902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
