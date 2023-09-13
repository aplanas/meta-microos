SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-plot-2.1.0-1.2.noarch.rpm"
RPM_HASH = "5e8aa3e99ccffce91c53d18069a915131ddc9ada2bff2d9c124de06e9fd06d3ff16cbad385962b6d7cbf8e1a56a367d9016b623be8311696192b43b93ff0f339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-plot"

RDEPENDS:${PN} += "python39-matplotlib \
python39-pandas"

inherit rpm
