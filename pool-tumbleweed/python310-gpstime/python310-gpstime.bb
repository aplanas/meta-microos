SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python310-gpstime-0.6.2-1.4.noarch.rpm"
RPM_HASH = "cdb9b6bb34f516ce5440efe5944afec4a29d73d32b1d217a72cab09dcf83f65c83361738a9d6dc0197bdab062427f1d1330c34983321b45f9ff3e1231342a1bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gpstime \
python310-gpstime \
python3dist-gpstime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-appdirs \
python310-python-dateutil \
python310-requests \
timezone \
update-alternatives"

inherit rpm
