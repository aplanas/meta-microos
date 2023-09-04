SUMMARY = "Documentation for texlive-rmpage"
DESCRIPTION = "This package includes the documentation for texlive-rmpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-doc-2023.209.0.0.92svn54080-54.2.noarch.rpm"
RPM_HASH = "2baba9afdb1d56e85f948e4032b249c9265a8e0381d97a7f93df28d4bde85f0bdf4724cac0e18a503ab92db7e441566812b392f4279b606431cd33ba8c93e89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
