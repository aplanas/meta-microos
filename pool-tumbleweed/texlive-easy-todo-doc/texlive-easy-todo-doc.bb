SUMMARY = "Documentation for texlive-easy-todo"
DESCRIPTION = "This package includes the documentation for texlive-easy-todo"
LICENSE = "Apache-1.0"

PV = "2023.201.svn32677"

RPM_NAME = "texlive-easy-todo-doc-2023.201.svn32677-53.2.noarch.rpm"
RPM_HASH = "fa6d9f37fdd4228143877283783a29a17896aeb94b495bf21dd205628cc600b1fa5b95cb4b6602a7580281c0563e07b4ce1e1627c84d1d99b56e52725e0da24b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
