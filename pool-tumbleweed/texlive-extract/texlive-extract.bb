SUMMARY = "Extract parts of a document and write to another document"
DESCRIPTION = "The package provides the means to extract specific content from \
a source document and write that to a target document. One \
could, for instance, use this to extract all exercises from \
lecture notes and generate an exercises book on the fly. The \
package also provides an environment which writes its body \
entirely to the target file. Another environment will write to \
the target file, but will also execute the body. This allows to \
share code (for instance, a preamble) between the source \
document and the target file. Finally, the package provides an \
interface to conditionally extract content. With a single \
package option, one can specify exactly which commands (counted \
from the start of the document) should be extracted and which \
not. This might be useful for extracting specific slides from a \
presentation and use them in a new file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9asvn52117"

RPM_NAME = "texlive-extract-2023.209.1.9asvn52117-53.1.noarch.rpm"
RPM_HASH = "e8ed39cb5aeac58519488b057cd07444a206f2c31e7c1d029a82d2c615c7ec9670ad5bcbabf940334d90df207798259d1bf28098f76bf224c170f51daf7d8e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extract.sty \
texlive-extract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
