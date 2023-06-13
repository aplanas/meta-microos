SUMMARY = "A ConTeXt implementation of lettrines"
DESCRIPTION = "This is a re-implementation of the LaTeX package lettrine."
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-lettrine-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "fe6f4120785b843effed69bd124e7054e0cf954fd98019a78c881fb7bab8298c9d0e3a510a7c2c69177c510372aab8e97c83846e306e424b6625cec369b48459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-lettrine.tex) \
texlive-context-lettrine"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
