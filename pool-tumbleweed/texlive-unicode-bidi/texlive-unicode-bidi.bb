SUMMARY = "Experimental unicode bidi package for XeTeX"
DESCRIPTION = "The experimental unicode-bidi package allows to mix non-RTL \
script with RTL script without any markup."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn42482"

RPM_NAME = "texlive-unicode-bidi-2023.201.0.0.01svn42482-53.1.noarch.rpm"
RPM_HASH = "432762b782127c171e586a225b22c776d3f8b07889b6201f4c6b5555bc8ff8b38038a0df9a231b539f72c56395bc7fb740f298abeb1e4df443c792b89a29b988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-bidi.sty \
texlive-unicode-bidi"

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
