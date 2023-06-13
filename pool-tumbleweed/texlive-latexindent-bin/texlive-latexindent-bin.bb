SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32150"

RPM_NAME = "texlive-latexindent-bin-2023.20230311.svn32150-91.1.aarch64.rpm"
RPM_HASH = "f96ede01e1cfcfecd91d49d5b5cb4ef8652167888647e83b73bd4164541e88209c24f7250fc380e711b558ed91864fb3495bc42e9532b77febc64e8800ef61f5"

RPROVIDES:${PN} += "texlive-latexindent-bin \
texlive-latexindent-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm
