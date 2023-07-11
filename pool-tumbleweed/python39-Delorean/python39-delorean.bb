SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-Delorean-1.0.0-4.8.noarch.rpm"
RPM_HASH = "d6cea4a97b55dd65834c6da15009c44669eb81bf696234fe924a3f4ce5832f890428c965a7c2632631cd85038a4e06ea3bb141a53d26bfb7db07af01258d2573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-delorean \
python39-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-humanize \
python39-python-dateutil \
python39-pytz \
python39-tzlocal"

inherit rpm
