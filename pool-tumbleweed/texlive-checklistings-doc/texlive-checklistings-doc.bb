SUMMARY = "Documentation for texlive-checklistings"
DESCRIPTION = "This package includes the documentation for texlive-checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38300"

RPM_NAME = "texlive-checklistings-doc-2023.209.1.0svn38300-54.1.noarch.rpm"
RPM_HASH = "a4ce80b0574c8895364ebeb1cf395e56201333ffd98f7f32a00ec07d195638c27dd5a40e8b9fecca20d0eb11999a95459aca803e737947d96752524f4cd519b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checklistings-doc"

RDEPENDS:${PN} += ""

inherit rpm
