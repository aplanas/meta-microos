SUMMARY = "Documentation for texlive-uppunctlm"
DESCRIPTION = "This package includes the documentation for texlive-uppunctlm"
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-doc-2023.209.0.0.1svn42334-54.1.noarch.rpm"
RPM_HASH = "6533965110179396e15ddc662d8fb970a3fc124587a274fccb66cb98a7638b86465e6ad598135ac42a0a6bc455c97ed3a887fc41ff943442e5fa228c08aefc69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uppunctlm-doc"

RDEPENDS:${PN} += ""

inherit rpm
