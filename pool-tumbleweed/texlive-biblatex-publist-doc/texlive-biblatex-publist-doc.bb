SUMMARY = "Documentation for texlive-biblatex-publist"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-publist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn66273"

RPM_NAME = "texlive-biblatex-publist-doc-2023.209.2.2svn66273-54.1.noarch.rpm"
RPM_HASH = "472e8c156d6c7f4e29916a4f0d77b1a38668c7f8c218ed73abdb6c349bcf6adc25b734d9970ed7384e3bf16c497e56f31b64ba0f6d8bda110cf930cfe381206f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-publist-doc"

RDEPENDS:${PN} += ""

inherit rpm
