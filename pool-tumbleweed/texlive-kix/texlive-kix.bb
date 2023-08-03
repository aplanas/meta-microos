SUMMARY = "Typeset KIX codes"
DESCRIPTION = "Implements KIX codes as used by the Dutch PTT for bulk mail \
addressing. (Royal Mail 4 State Code.) KIX is a registered \
trade mark of PTT Post Holdings B. V."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21606"

RPM_NAME = "texlive-kix-2023.209.svn21606-56.1.noarch.rpm"
RPM_HASH = "3e2820cdd6cbe350eb83130efa9a79504a0ffdbbb146a24bbcc3e553c06c7823396cfc07480bfafd069824e2146faa9796599527659d978960de10a4633014e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kix.sty \
texlive-kix"

RDEPENDS:${PN} += "/usr/bin/sh \
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
