SUMMARY = "Intelligent cross-referencing"
DESCRIPTION = "The package enhances LaTeX's cross-referencing features, \
allowing the format of references to be determined \
automatically according to the type of reference. The formats \
used may be customised in the preamble of a document; babel \
support is available (though the choice of languages remains \
limited: currently Danish, Dutch, English, French, German, \
Italian, Norwegian, Russian, Spanish and Ukranian). The package \
also offers a means of referencing a list of references, each \
formatted according to its type. In such lists, it can collapse \
sequences of numerically-consecutive labels to a reference \
range."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21.4svn61719"

RPM_NAME = "texlive-cleveref-2023.209.0.0.21.4svn61719-54.1.noarch.rpm"
RPM_HASH = "dd08a399d34d387d9da503c6cb83bc0d124315cb3d006cfc9a26c9d882f57b0a6e80eae97bca5b2f9963386344461d3cbbee72add6fba0ca208c9e9c37c49cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleveref.sty \
texlive-cleveref"

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
