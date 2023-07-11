SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-plot-2.0.2-4.1.noarch.rpm"
RPM_HASH = "8f4cee1e1bc18955cbd7c6c6b1c739ccc851c88e01055f06caaf6a2f01c76289f4acd1e1975ff9d0f41b58e830d9b6768bbf94a815785c98c4bdba339e037b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-plot"

RDEPENDS:${PN} += "python39-matplotlib \
python39-pandas"

inherit rpm
