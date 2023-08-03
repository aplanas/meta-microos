SUMMARY = "Documentation for texlive-assignment"
DESCRIPTION = "This package includes the documentation for texlive-assignment"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20431"

RPM_NAME = "texlive-assignment-doc-2023.209.svn20431-54.1.noarch.rpm"
RPM_HASH = "e15d4bfd9423e293052f72de9e587d3b3b3e9e7b917a829429cca6538873a2669497d0c5f62a2a8da2a32a516910a73a94fa273c8a9df4e154fdda5db60d8a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assignment-doc"

RDEPENDS:${PN} += ""

inherit rpm
