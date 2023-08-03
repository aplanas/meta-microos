SUMMARY = "A bundle of utilities by Jonathan Sauer"
DESCRIPTION = "The bundle consists of: a tool for collecting text for later \
re-use, a tool for typesetting the 'meta-information' within a \
text, a tool for use in constructing macros with multiple \
optional parameters, a package for multiple column parallel \
texts, a tool for processing key-value structured lists, and \
macros for typesetting a number as a German-language string."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sauerj-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "cc656b0d9bba3bbb955f8acb5e8e9279e6a84ecc3874ce5359c9d8b930d13625d51abe0afa0522a02086aed06fd41c16e81c3997bc42e3c4b0946432b950235b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collect.sty \
tex-metainfo.sty \
tex-optparams.sty \
tex-parcolumns.sty \
tex-processkv.sty \
tex-zahl2string.sty \
texlive-sauerj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
