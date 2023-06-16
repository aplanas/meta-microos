SUMMARY = "Fetch the current class name"
DESCRIPTION = "With standard LaTeX you are able to check for the class in use \
invoking the kernel command \\@ifclassloaded. However, doing so \
you cannot get the explicit class name, unless you want to loop \
over every possible class name until \\@ifclassloaded returns \
true -- don't do that! With the help of the present package you \
can obtain the name of the current class with significantly \
less effort. Just load the package as usual: \
\\usepackage{fetchcls}; then, the control sequence \\classname \
will hold the name you were looking for."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45245"

RPM_NAME = "texlive-fetchcls-2023.201.1.0svn45245-52.1.noarch.rpm"
RPM_HASH = "050640cedde8ff3335a29db66ec70364fe181b4a50732ecc91d999d50fa4b4eda2e08e4c89bdf025dd623741b4597baec49970d56c2b9ade1d634a69613dd332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fetchcls.sty \
texlive-fetchcls"

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
