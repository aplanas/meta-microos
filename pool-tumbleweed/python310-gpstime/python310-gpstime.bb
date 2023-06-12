SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python310-gpstime-0.6.2-1.2.noarch.rpm"
RPM_HASH = "2bb3c2a10bf8894f13e0eae30c6fd91783c202ad82bc262676bc863326a839c500a281af2d8acd8ea5a041c2a4ed3eab2a9b895d75f9026905a91ee5aa1e6e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpstime \
python3.10dist(gpstime) \
python310-gpstime \
python3dist(gpstime)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-appdirs \
python310-python-dateutil \
python310-requests \
timezone \
update-alternatives"

inherit rpm
