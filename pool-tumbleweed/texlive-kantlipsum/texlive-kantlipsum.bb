SUMMARY = "Generate sentences in Kant's style"
DESCRIPTION = "The package spits out sentences in Kantian style; the text is \
provided by the Kant generator for Python by Mark Pilgrim, \
described in the book 'Dive into Python'. The package is \
modelled on lipsum, and may be used for similar purposes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8asvn51727"

RPM_NAME = "texlive-kantlipsum-2023.209.0.0.8asvn51727-56.1.noarch.rpm"
RPM_HASH = "da199089c210eee8a167feadaff39aa4fe37b8b4f4b18147e945fab9f069afc1a5b2f43410a28d6f05af4ed8804c24a3d0f6e810c1cd6c5a546e29e38b8a6a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kantlipsum.sty \
texlive-kantlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
