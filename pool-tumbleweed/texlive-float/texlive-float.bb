SUMMARY = "Improved interface for floating objects"
DESCRIPTION = "Improves the interface for defining floating objects such as \
figures and tables. Introduces the boxed float, the ruled float \
and the plaintop float. You can define your own floats and \
improve the behaviour of the old ones. The package also \
provides the H float modifier option of the obsolete here \
package. You can select this as automatic default with \
\\floatplacement{figure}{H}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn15878"

RPM_NAME = "texlive-float-2023.201.1.3dsvn15878-52.1.noarch.rpm"
RPM_HASH = "35e0985c985252c86db4fe0f22e8685601accd1ddadd84abd56b1d2a2946c29e266602feaaaf4fb25270f0c02f9aea9fd15a1995e20b111514f7fcdf754f0744"
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
