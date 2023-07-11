SUMMARY = "Documentation for texlive-xunicode"
DESCRIPTION = "This package includes the documentation for texlive-xunicode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-doc-2023.201.0.0.981svn30466-52.2.noarch.rpm"
RPM_HASH = "47767eb679bcdbf1daac43b0e515c5e815dd06d55d582eeba07469acd34ba1f2adf501dfa2f694aa68066159d7023711f5c302b353b7fb52ddf00dac251538e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
