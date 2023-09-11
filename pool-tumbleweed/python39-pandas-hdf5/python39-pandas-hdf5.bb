SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-hdf5-2.0.3-1.3.noarch.rpm"
RPM_HASH = "dbd927b0ba916cfc8387a82dd7ec93351910153de66e667736bec620122df48b2da1156fc13324b35f3e700ce2d87a97edf77cfac51e0cfea6b466646c10f07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-hdf5"

RDEPENDS:${PN} += "python39-blosc \
python39-pandas \
python39-tables"

inherit rpm
