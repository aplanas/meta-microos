SUMMARY = "Documentation for texlive-shapes"
DESCRIPTION = "This package includes the documentation for texlive-shapes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42428"

RPM_NAME = "texlive-shapes-doc-2023.209.1.1svn42428-54.1.noarch.rpm"
RPM_HASH = "ee0a58527fa6ff8bc3446509d19b67b4d2182a251047501096dfb08677b95dba2b3aa89e74d450f350812a8ff0eeec96a44aca1e413ebe65ceafe6498ea1a8c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapes-doc"

RDEPENDS:${PN} += ""

inherit rpm
