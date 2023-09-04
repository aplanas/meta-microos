SUMMARY = "Documentation for texlive-edichokey"
DESCRIPTION = "This package includes the documentation for texlive-edichokey"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-doc-2023.209.2.01ysvn56223-54.2.noarch.rpm"
RPM_HASH = "dd81566003a027602103a2a56c79d2881137c6861160d4165cae1e2b092f1076ef75dd82ac0e6a9b62a3bd8c15f10662b1d2ff0e771a15cfa9e66b74e7818123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
