SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python311-icalendar-4.1.0-1.6.noarch.rpm"
RPM_HASH = "d6ec0e3b536aef6846fbc433b0ad5611ae9c1f298f0e7d4348a8776caa59b4d6ef669fb146483f64c613b460015920cfcca4af507dcd654f3b432b93ffe6e1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icalendar \
python3-icalendar-doc \
python3.11dist-icalendar \
python311-icalendar \
python311-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-pytz \
update-alternatives"

inherit rpm
