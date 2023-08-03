SUMMARY = "MetaPost package providing high-level objects"
DESCRIPTION = "METAOBJ is a large MetaPost package providing high-level \
objects. It implements many of PSTricks' features for node \
connections, but also trees, matrices, and many other things. \
It more or less contains boxes.mp and rboxes.mp. There is a \
large (albeit not complete) documentation distributed with the \
package. It is easily extensible with new objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-2023.209.0.0.93svn15878-55.1.noarch.rpm"
RPM_HASH = "bff64e70968141d9e71a7fbb04b53e408e99de10a41fa14288a83fefcfb6291143414535519da86b995404cba6cdfd04f9517a32c16cc2dd430847fb90b27219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj"

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
