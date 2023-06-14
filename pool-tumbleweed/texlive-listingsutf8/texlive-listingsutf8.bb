SUMMARY = "Allow UTF-8 in listings input"
DESCRIPTION = "Package listings does not support files with multi-byte \
encodings such as UTF-8. In the case of \\lstinputlisting, a \
simple workaround is possible if a one-byte encoding exists \
that the file can be converted to. The package requires the \
e-TeX extensions under pdfTeX (in either PDF or DVI output \
mode)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-2023.201.1.5svn53097-54.1.noarch.rpm"
RPM_HASH = "401baa0b8ebcd0b192c8552fc3d7e28bd8d619894ab8a25a45ad0c68ab07ed14615be66c77d137544edbf0071f18ab94ebf8e0b315e92f046ca693801935c708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listingsutf8.sty \
texlive-listingsutf8"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-listings.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
