SUMMARY = "Documentation for texlive-glossaries"
DESCRIPTION = "This package includes the documentation for texlive-glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.52svn64919"

RPM_NAME = "texlive-glossaries-doc-2023.209.4.52svn64919-54.1.noarch.rpm"
RPM_HASH = "b61c7e94e9cee194521668f6aab7b12c6610bf6dd7fa646e066677d2f2f548d23ce174fdffb0ced3c17520e048e5ab414b5fcc591dfa96b5846f851afce26490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeglossaries-lite.1 \
man-makeglossaries.1 \
texlive-glossaries-doc"

RDEPENDS:${PN} += ""

inherit rpm
