SUMMARY = "Allow UTF-8 in listings input"
DESCRIPTION = "Package listings does not support files with multi-byte \
encodings such as UTF-8. In the case of \\lstinputlisting, a \
simple workaround is possible if a one-byte encoding exists \
that the file can be converted to. The package requires the \
e-TeX extensions under pdfTeX (in either PDF or DVI output \
mode)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-2023.209.1.5svn53097-55.1.noarch.rpm"
RPM_HASH = "f4a09408763d0a45cc28c61b48ae5328bd161a984bdc1242ca12e8be938e52c2c36189f80734191d3deaaf851d5d56695e2023229825378e9dd765e903d38e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listingsutf8.sty \
texlive-listingsutf8"

RDEPENDS:${PN} += "/usr/bin/sh \
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
