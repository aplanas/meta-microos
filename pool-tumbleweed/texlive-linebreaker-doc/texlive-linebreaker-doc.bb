SUMMARY = "Documentation for texlive-linebreaker"
DESCRIPTION = "This package includes the documentation for texlive-linebreaker"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn66461"

RPM_NAME = "texlive-linebreaker-doc-2023.209.0.0.1bsvn66461-55.1.noarch.rpm"
RPM_HASH = "b35bdf6af2d01df92ca1022af82f4d7c949695fa8c164e7c26002269b28ef85180493514c3899be400fee26a6344e2454476d7f32b8f93fe38fefdf13996f26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linebreaker-doc"

RDEPENDS:${PN} += ""

inherit rpm
