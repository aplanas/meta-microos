SUMMARY = "Documentation for texlive-postnotes"
DESCRIPTION = "This package includes the documentation for texlive-postnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn66019"

RPM_NAME = "texlive-postnotes-doc-2023.209.0.0.2.3svn66019-53.1.noarch.rpm"
RPM_HASH = "7f78ad7d2312c551003ef775e4430aac351df2e2ac74ec9e95adc1f908cd0e793b8a6fff9f355849c1f7ed67913235c9d7c8aac0b4cc2d827151a74208f9e62f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
