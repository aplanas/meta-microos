SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-plot-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e456eb8fe59a7b5c6b4757465f0ded7e2298f1f87d665b9fd08c073de2935413587669e9d7dbbb1dc1112edd88372696eb2455bf6bb3900c39578ea48c14a5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-plot"

RDEPENDS:${PN} += "python310-matplotlib \
python310-pandas"

inherit rpm
