SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-Delorean-1.0.0-4.8.noarch.rpm"
RPM_HASH = "13ea1dab0bb7b7d56a20abd2f42aa49668ffddc038033d83082f635fbbfcbea893ca6c7a661e1a36de22cef0c2532eeb0bdeb52b9424efc94760140b53e27e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-delorean \
python310-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-humanize \
python310-python-dateutil \
python310-pytz \
python310-tzlocal"

inherit rpm
