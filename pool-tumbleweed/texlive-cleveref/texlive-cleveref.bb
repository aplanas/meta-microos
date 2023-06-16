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

PV = "2023.201.0.0.21.4svn61719"

RPM_NAME = "texlive-cleveref-2023.201.0.0.21.4svn61719-53.1.noarch.rpm"
RPM_HASH = "caa9fe557b9f19b1876df36d283ada466b52b658b935043e75c60ffb11a7e954c5ca3c751023c298c3867ca458ab4771e58153174d5145665cf18c0dfdd61326"
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
