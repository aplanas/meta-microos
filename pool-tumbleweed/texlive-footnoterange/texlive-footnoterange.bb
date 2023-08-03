SUMMARY = "References to ranges of footnotes"
DESCRIPTION = "The package provides the environments footnoterange and \
footnoterange*. Multiple footnotes inside these environments \
are not referenced as (e.g.) '1 2 3' but as '1-3', i.e., the \
range (from first to last referred footnote at that place) is \
given. If the hyperref package is loaded with enabled \
hyperfootnotes-option, then the references are hyperlinked. \
(References to footnotes in footnoterange* environments are \
never hyperlinked.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn66149"

RPM_NAME = "texlive-footnoterange-2023.209.1.1asvn66149-53.1.noarch.rpm"
RPM_HASH = "cd05d1f26341041ae0423a87ee5731939422e7ec20ef15ddecf9621e922c8931cd7aaff35999bbfdf8b5b74c64aecd63cf7bc12ef5f20c06c8c3980de5671356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnoterange.sty \
texlive-footnoterange"

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
