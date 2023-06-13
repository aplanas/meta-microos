SUMMARY = "Make a Cookbook"
DESCRIPTION = "The makecookbook bundle contains the files needed to create a \
nice quality family cookbook in a form ready to submit to most \
print-on-demand companies. Modifiable choices have been made \
regarding standard book features such as trim size, margins, \
headers/footers, chapter heading formatting, front matter \
(copyright page, table of contents, etc.) and back matter \
(index). Commands and environments have been created to format \
the food stories and recipes. The user will need to: supply \
their own food stories and recipes(!), and install the needed \
fonts. We assume a LuaTeX compile. Please note that no new \
document class or package is included here. Rather, we provide \
a modifiable preamble and a small number of other files that, \
together, fully support creation of all of the internal pages \
of a cookbook (i.e., everything except the cover art)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.85svn49311"

RPM_NAME = "texlive-makecookbook-2023.201.0.0.85svn49311-52.1.noarch.rpm"
RPM_HASH = "7a6c13020e94f997fe0518cf88f45b4686bef38e1ab6528387f15cd51955f2d286756fc51634ee413b609afe26ba83edc102320e6d8c33cf71163b8d931cea54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecookbook"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
