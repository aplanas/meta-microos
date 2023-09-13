SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-hdf5-2.1.0-1.2.noarch.rpm"
RPM_HASH = "c6717f315b57ed28e2961614819178f493e8bdf778b2f0eaee309482b40ab21307219926366fbf6606f8ffc04c550cc63010eb4d904f81818409398782da680f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-hdf5"

RDEPENDS:${PN} += "python39-blosc \
python39-pandas \
python39-tables"

inherit rpm
