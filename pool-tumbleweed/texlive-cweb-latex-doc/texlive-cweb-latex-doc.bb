SUMMARY = "Documentation for texlive-cweb-latex"
DESCRIPTION = "This package includes the documentation for texlive-cweb-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn28878"

RPM_NAME = "texlive-cweb-latex-doc-2023.209.svn28878-55.1.noarch.rpm"
RPM_HASH = "5201639df535319600c8dd5d3408993768e49ba2f2b9f2eac7c2e7ab594ede9181f3104f48e7b70ddb95302349ee9fbddab3ade7cbbf251da6485cb46e58541f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cweb-latex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
