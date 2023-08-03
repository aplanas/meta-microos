SUMMARY = "Improved interface for floating objects"
DESCRIPTION = "Improves the interface for defining floating objects such as \
figures and tables. Introduces the boxed float, the ruled float \
and the plaintop float. You can define your own floats and \
improve the behaviour of the old ones. The package also \
provides the H float modifier option of the obsolete here \
package. You can select this as automatic default with \
\\floatplacement{figure}{H}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn15878"

RPM_NAME = "texlive-float-2023.209.1.3dsvn15878-53.1.noarch.rpm"
RPM_HASH = "d2d3e64b90d7e38e9e8062afb74edff52ff9bb6f0ee7e3903e71c9e07f8c773cf358ef290139ddb729f03ebbc0bd44f1adfc42ddf7307526654b8330a2cae681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-float.sty \
texlive-float"

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
