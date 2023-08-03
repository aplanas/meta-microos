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

PV = "2023.209.5.2nsvn64389"

RPM_NAME = "texlive-csquotes-2023.209.5.2nsvn64389-55.1.noarch.rpm"
RPM_HASH = "be05a15ea37a11ac9c215ac8e945fb30bf2fa6554ab9d52a75adc859d2ac69dde171cbcb3a26c697336908af4443a430a5bf3a216cf7a0835548eaa41c136eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csq-compat.def \
tex-csquotes.cfg \
tex-csquotes.def \
tex-csquotes.sty \
texlive-csquotes"

RDEPENDS:${PN} += "/usr/bin/sh \
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
