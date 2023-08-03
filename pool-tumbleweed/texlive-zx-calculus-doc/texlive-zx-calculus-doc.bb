SUMMARY = "Documentation for texlive-zx-calculus"
DESCRIPTION = "This package includes the documentation for texlive-zx-calculus"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60838"

RPM_NAME = "texlive-zx-calculus-doc-2023.209.svn60838-53.1.noarch.rpm"
RPM_HASH = "47704fd73e370442dbcc1389f71ff251cd001c5921a3f06aeabcdb36f87f7c5f43c636ade6c1a1b15dc48de16d322399f6789ccd21734fe8ebe797db00e45807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zx-calculus-doc"

RDEPENDS:${PN} += ""

inherit rpm
