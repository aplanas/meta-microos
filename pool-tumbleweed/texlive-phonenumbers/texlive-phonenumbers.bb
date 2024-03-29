SUMMARY = "Typesetting telephone numbers with LaTeX"
DESCRIPTION = "The phonenumbers package makes it possible to typeset telephone \
numbers according to different national conventions. German, \
Austrian, French, British and North American phone numbers are \
supported. Phone numbers from other countries are supported \
rudimentarily. The user can select from various formatting \
options, including the additional output of the country calling \
code. The package is able to check if a phone number is valid \
according to the national rules. It also allows to link phone \
numbers using the hyperref package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn63774"

RPM_NAME = "texlive-phonenumbers-2023.209.2.5svn63774-52.1.noarch.rpm"
RPM_HASH = "f3d344715fe41f901d4bae74304f44675e6f06cc6876dfda29bd4aaf676ea7928a0227f93ee623aee8c86d0accfbae0072e5cbf846e3fdba19fd0b6081fdbd07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phonenumbers-AT.def \
tex-phonenumbers-DE.def \
tex-phonenumbers-FR.def \
tex-phonenumbers-UK.def \
tex-phonenumbers-US.def \
tex-phonenumbers.sty \
texlive-phonenumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
