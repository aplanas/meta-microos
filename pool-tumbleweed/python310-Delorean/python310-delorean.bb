SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-Delorean-1.0.0-4.6.noarch.rpm"
RPM_HASH = "35da331d0b092078cbf74e3ec5dcf4f948e04a24df655d87287b2aea73bb10c28aae6020471194938bf95ee0f47f1c5afdd085051b85023554cdaddf4634aa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Delorean \
python3.10dist(delorean) \
python310-Delorean \
python3dist(delorean)"

RDEPENDS:${PN} += "python(abi) \
python310-Babel \
python310-humanize \
python310-python-dateutil \
python310-pytz \
python310-tzlocal"

inherit rpm
