SUMMARY = "A package for LaTeX localisation"
DESCRIPTION = "The package is designed to localise any document class or \
package. This should be very useful for end-users who could \
obtain messages in their own preferred language. It is really \
easy to use by writers of other classes and packages. \
Volunteers are urged to test the package, report, and even to \
localise the message file to their own language. Documentation \
is provided in English."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.51svn49578"

RPM_NAME = "texlive-msg-2023.209.0.0.51svn49578-55.1.noarch.rpm"
RPM_HASH = "94c978af7dcf141750567ec365cfcdff7d179f11d24d1cb4fbfabba63d14ba25611487300caf6dc583a65b34d6474c2e5844d2d49596207131e989be269640cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-french-msg-msg.tex \
tex-german-msg-msg.tex \
tex-msg-msg.tex \
tex-msg.sty \
tex-norsk-msg-msg.tex \
texlive-msg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
