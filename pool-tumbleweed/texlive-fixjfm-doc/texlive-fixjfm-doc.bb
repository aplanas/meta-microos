SUMMARY = "Documentation for texlive-fixjfm"
DESCRIPTION = "This package includes the documentation for texlive-fixjfm"
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.8svn63967"

RPM_NAME = "texlive-fixjfm-doc-2023.209.0.0.8svn63967-53.1.noarch.rpm"
RPM_HASH = "d4fdf38417f46dde43d222fd28aefaedff3c8581f44278d2424913fffd4388e7a5a8ae60e2532055246594102b7937afb6002d20c79e3a66f3ba3330cab37cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixjfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
