SUMMARY = "A package for LaTeX localisation"
DESCRIPTION = "The package is designed to localise any document class or \
package. This should be very useful for end-users who could \
obtain messages in their own preferred language. It is really \
easy to use by writers of other classes and packages. \
Volunteers are urged to test the package, report, and even to \
localise the message file to their own language. Documentation \
is provided in English."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.51svn49578"

RPM_NAME = "texlive-msg-2023.201.0.0.51svn49578-54.1.noarch.rpm"
RPM_HASH = "dc4acea970590a5ae896cbc7ceb23ac87d1fe4169f594daa75fed0186c3ab23bccbc0e2538809befb33162c337a449d8f99d59f024a0958d8331e093e793851c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(french_msg-msg.tex) \
tex(german_msg-msg.tex) \
tex(msg-msg.tex) \
tex(msg.sty) \
tex(norsk_msg-msg.tex) \
texlive-msg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(inputenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
