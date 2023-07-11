SUMMARY = "LaTeX style file axodraw4j.sty for documents generated with jaxodraw"
DESCRIPTION = "This package contains the LaTeX style file that is needed for EPS export \
functionality in jaxodraw. \
 \
You need this if you want the export to EPS function to work or if you want to \
compile LaTeX files generated with jaxodraw."
LICENSE = "LPPL-1.3c"

PV = "2.1.0"

RPM_NAME = "jaxodraw-latex-2.1.0-6.7.noarch.rpm"
RPM_HASH = "fc2321b7975920795ad5792bf0ce957a9e4c6a27c8e19e0d3070d6524de3a3fcbfc9cab9ade9306a8333025467324667dccaf01ef6187ab40f2977b9e472d6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
jaxodraw \
tex-latex \
texlive \
texlive-pst-tools"

inherit rpm
