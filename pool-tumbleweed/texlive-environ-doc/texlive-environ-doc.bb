SUMMARY = "Documentation for texlive-environ"
DESCRIPTION = "This package includes the documentation for texlive-environ"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn56615"

RPM_NAME = "texlive-environ-doc-2023.209.0.0.3svn56615-54.2.noarch.rpm"
RPM_HASH = "a6a3450f8a456ae6c002f6469cf0157812dba7abf6bc00d264c2de2f456664563e9cf0f3dadb031c05341e48e72bd655fe39b141537cd4a9a90ae0837b063966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-environ-doc"

RDEPENDS:${PN} += ""

inherit rpm
