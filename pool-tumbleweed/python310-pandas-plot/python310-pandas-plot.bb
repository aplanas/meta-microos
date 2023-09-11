SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-plot-2.0.3-1.3.noarch.rpm"
RPM_HASH = "2058b1df6e8c38e0459110339f6ed9e963f3d35b8011c88b49596b79136f2d91ec2351da6a2e4130aa66886609dfb1798d84500de326dc7d06d5d06f6444d3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-plot"

RDEPENDS:${PN} += "python310-matplotlib \
python310-pandas"

inherit rpm
