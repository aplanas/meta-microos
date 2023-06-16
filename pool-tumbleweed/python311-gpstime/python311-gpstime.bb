SUMMARY = "GPS-aware Python datetime module"
DESCRIPTION = "This package provides GPS time conversion utilities, including a \
gpstime subclass of the built-in datetime class with the addition of \
GPS time parsing and conversion methods. \
 \
It also provides a command-line GPS conversion utility that uses the \
gpstime module, a rough work-alike to LIGO 'tconvert' utility."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "python311-gpstime-0.6.2-1.2.noarch.rpm"
RPM_HASH = "4f5d6be19323bc239cc9e088020db36decb2d0b71a49b945b7b1dd894265ae8d9c44ef350ac4123c0729e9504310a7e60c9f4129fea7491e4d1bb2155a0c8d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gpstime \
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
