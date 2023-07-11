SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python39-gpstime-0.6.2-1.4.noarch.rpm"
RPM_HASH = "ba802f241e28df26d8fe395c5fba8a470fff71836394d4a244fd57d45cf34453f4077a4b22947a17469f57a7e17cbcda664bfb7f646b20ae3ae4176f0ce5689d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gpstime \
python39-gpstime \
python3dist-gpstime"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-appdirs \
python39-python-dateutil \
python39-requests \
timezone \
update-alternatives"

inherit rpm
