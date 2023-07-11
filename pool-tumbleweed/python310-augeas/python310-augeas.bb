SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "python310-augeas-1.1.0-1.1.noarch.rpm"
RPM_HASH = "00a83b8f8260743bead78061e4682242c5a7180b839d09ad9c5007d985bd7481e6d1f448d4d377acc86cf9c670a5d4fd899ee4f2d2ba8f6985546414a8f749d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-augeas \
python310-augeas \
python3dist-python-augeas"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
python-abi"

inherit rpm
