SUMMARY = "League Of Movable Type's 'Goudy Bookletter 1911' font"
DESCRIPTION = "A serif font based on Frederic Goudy's Kennerley Oldstyle."
LICENSE = "SUSE-Public-Domain"

PV = "0.20121218"

RPM_NAME = "lomt-goudybookletter-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "ee0da2144bf9efea8cd6c04bd85d0d925f01d8189b33eb76e4492669210988c82f73d3b79e0c5252aeb9d2a0b24f2ae1d3ef83f1797667ad8174b0078dceef58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-goudybookletter-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
