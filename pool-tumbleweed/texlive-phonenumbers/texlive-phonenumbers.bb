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

PV = "2023.201.2.5svn63774"

RPM_NAME = "texlive-phonenumbers-2023.201.2.5svn63774-51.1.noarch.rpm"
RPM_HASH = "39b03b62a66c50298fa8015163261e52e7b32691506aea0087c5e8f7ee27042c4673f561ed3023b6797e81cff6035fa7008e2c29f6630a301fa593f6f54c7abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phonenumbers-AT.def) \
tex(phonenumbers-DE.def) \
tex(phonenumbers-FR.def) \
tex(phonenumbers-UK.def) \
tex(phonenumbers-US.def) \
tex(phonenumbers.sty) \
texlive-phonenumbers"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
