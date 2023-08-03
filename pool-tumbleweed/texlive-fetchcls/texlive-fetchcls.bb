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

PV = "2023.209.1.0svn45245"

RPM_NAME = "texlive-fetchcls-2023.209.1.0svn45245-53.1.noarch.rpm"
RPM_HASH = "c27dc265d9ff2860ab983faaab65fa4a69ad22b903f5e5e1f63bc3dafb8ea6d3a140f5e24fb79a3d515b2d58bd54f47a0bcc2dc307443156d2eeede0095a416a"
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
