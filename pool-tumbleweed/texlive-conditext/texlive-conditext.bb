SUMMARY = "Define and manage conditional content"
DESCRIPTION = "This package provides some commands to define and manage \
conditional content in a LaTeX source document. A conditional \
content, in the sense within this is understood in this \
package, is a text (including mathematical or other formulas) \
and/or a graphical element (diagram, figure, image...) as \
substitutable forms, which, according to a condition test, may \
or may not appear in the generated document. One of the most \
common forms of conditional content management is multilingual \
; but it can also include versioning, confidentiality levels, \
and so on. The philosophy of this package is based on the \
respective notions of condition field, condition property and \
condition space. With this package, any substitutable form in a \
source document is identified by a condition field and a \
condition property. The condition field is a functional theme \
that allows you to group together substitutable forms for the \
same conditional management. The condition property is a \
functional characterization specific to each substitutable form \
of a single condition domain. The condition space is used to \
designate the substitutable form(s) that must appear in the \
generated document. A condition space is defined by specifying \
a condition domain and a condition property to match with one \
or more substitutable forms."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn55387"

RPM_NAME = "texlive-conditext-2023.201.1.5svn55387-53.1.noarch.rpm"
RPM_HASH = "a763e8070f2e97abc500925262efcef7bf2c6c928bde1149f6056a0c1419097065acc42a7944b50430272e3ce0afaaba6345079e1b8f52368d38716ce3af9e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(CondiTeXt.sty) \
texlive-conditext"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(simplekv.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
