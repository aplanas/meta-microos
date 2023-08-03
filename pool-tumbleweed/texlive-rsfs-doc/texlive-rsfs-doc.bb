SUMMARY = "Documentation for texlive-rsfs"
DESCRIPTION = "This package includes the documentation for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rsfs-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "2cf866c85ebd91b794bbf910925bd40c40eb792074b0cd461038ca6248b5252a163f9b8eb09d0c84fbc0853779970f295078db347b3864435a1ddff51adb9177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
