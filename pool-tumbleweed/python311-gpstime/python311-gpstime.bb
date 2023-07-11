SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python311-gpstime-0.6.2-1.4.noarch.rpm"
RPM_HASH = "b52d4077c2357092d36677b8dba6551518b40791bbdadd9d474957c5aa9870fe2b2181fece0278414d20d3a31ae064be596a761f6832907685ab8bbe2bf1111e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpstime \
python3.11dist-gpstime \
python311-gpstime \
python3dist-gpstime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-appdirs \
python311-python-dateutil \
python311-requests \
timezone \
update-alternatives"

inherit rpm
