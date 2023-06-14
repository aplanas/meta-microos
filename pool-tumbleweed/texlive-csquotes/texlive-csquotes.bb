SUMMARY = "Context sensitive quotation facilities"
DESCRIPTION = "This package provides advanced facilities for inline and \
display quotations. It is designed for a wide range of tasks \
ranging from the most simple applications to the more complex \
demands of formal quotations. The facilities include commands, \
environments, and user-definable 'smart quotes' which \
dynamically adjust to their context. Quotation marks are \
switched automatically if quotations are nested and they can be \
adjusted to the current language if the babel package is \
available. There are additional facilities designed to cope \
with the more specific demands of academic writing, especially \
in the humanities and the social sciences. All quote styles as \
well as the optional active quotes are freely configurable. The \
package is dependent on e-TeX, and requires the author's \
etoolbox package."
LICENSE = "LPPL-1.0"

PV = "2023.204.5.2nsvn64389"

RPM_NAME = "texlive-csquotes-2023.204.5.2nsvn64389-54.1.noarch.rpm"
RPM_HASH = "601d266a33716f8b992fb0c638876cbba5dd8ad20cbff9236b574af44fb9081a9e473e839423d34f6da3aa0d8b316fa882295ab350662173198e62dc80b9a702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csq-compat.def \
tex-csquotes.cfg \
tex-csquotes.def \
tex-csquotes.sty \
texlive-csquotes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-inputenc.sty \
tex-keyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
