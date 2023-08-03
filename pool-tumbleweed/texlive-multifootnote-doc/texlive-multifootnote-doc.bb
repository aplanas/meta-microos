SUMMARY = "Documentation for texlive-multifootnote"
DESCRIPTION = "This package includes the documentation for texlive-multifootnote"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63456"

RPM_NAME = "texlive-multifootnote-doc-2023.209.svn63456-55.1.noarch.rpm"
RPM_HASH = "8b4de05548bbc59305192177f3485f65eb1b229b53a477abc05a7dde447e03a4782d42c2e874821844bc4463c116a0356925c7c4658b57500621569f16d33d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multifootnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
