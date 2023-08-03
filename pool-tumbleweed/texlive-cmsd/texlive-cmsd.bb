SUMMARY = "Interfaces to the CM Sans Serif Bold fonts"
DESCRIPTION = "Thr purpose of the package is to provide an alternative \
interface to the CM Sans Serif boldface fonts. The EC (T1, \
Cork) encoded versions of the 'CM Sans Serif boldface extended' \
fonts differ considerably from the traditionally (OT1) encoded \
ones: at large sizes, >10pt, they have thinner strokes and are \
much wider. At 25pt they are hardly to be recognized as being \
'boldface'. This package attempts to make these T1 fonts look \
like the traditional ones did. You do not need any new fonts; \
the package just changes the way LaTeX makes use of the current \
ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18787"

RPM_NAME = "texlive-cmsd-2023.209.svn18787-54.1.noarch.rpm"
RPM_HASH = "085ffe9a419663c67e4753bf94473d19ea3fe67dd2c5e9fbe0947cfb84c076596c3420b0bbfc8df0581d9336911a007b061f6fe5dbac572ae16f2fa75f52074b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmsd.sty \
tex-t1cmsd.fd \
tex-ts1cmsd.fd \
texlive-cmsd"

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
