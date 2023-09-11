SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-mysql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "9426d8a6a8846071c7901b373e7e40f21de5782c874f7755357c2bdf1a553f5fd9537487dd3eebb5216a1f486cf441e92b47154e09e61dd253271ecb486bb029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-mysql"

RDEPENDS:${PN} += "python39-PyMySQL \
python39-SQLAlchemy \
python39-pandas"

inherit rpm
