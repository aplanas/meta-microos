SUMMARY = "Documentation for texlive-lccaps"
DESCRIPTION = "This package includes the documentation for texlive-lccaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn46432"

RPM_NAME = "texlive-lccaps-doc-2023.209.1.0svn46432-55.1.noarch.rpm"
RPM_HASH = "f8558b836a13c3fe0f75da7cdf8494ae6fd545c472bd815a25795ec43af1d4b751d342d81ef40def31f9b0fc2be896447ac08974f6fedd6c575556fd65e1000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lccaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
