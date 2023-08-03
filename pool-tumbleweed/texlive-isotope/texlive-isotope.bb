SUMMARY = "A package for typesetting isotopes"
DESCRIPTION = "The package provides a command \\isotope for setting the atomic \
weight and atomic number indications of isotopes. (The naive \
way of doing the job with (La)TeX mathematics commands produces \
an unsatisfactory result.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn23711"

RPM_NAME = "texlive-isotope-2023.209.0.0.3svn23711-56.1.noarch.rpm"
RPM_HASH = "5f34bf50d898f6c1c43d8a7ca5470a38fb6cc6261930f1c70a1205cc734ee0a69eed3816571b62d5ce8681931f01ef407ce5ea0ecf13e1381c1c9bf505fc8689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isotope.sty \
texlive-isotope"

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
