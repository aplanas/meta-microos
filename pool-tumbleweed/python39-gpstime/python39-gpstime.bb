SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python39-gpstime-0.6.2-1.2.noarch.rpm"
RPM_HASH = "8c75e0d0af0f616934b3ae5de5ccef11de5bb1e6a7ee91e50e71eefc65af8826bebe58c7b149a47cfd8ccfc92b63157762ca2889c3b28c96fd2c8f987d534c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gpstime) \
python39-gpstime \
python3dist(gpstime)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-appdirs \
python39-python-dateutil \
python39-requests \
timezone \
update-alternatives"

inherit rpm
