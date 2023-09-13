SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python311-dateparser-1.1.8-3.1.noarch.rpm"
RPM_HASH = "23a56088cea70b3b7e4b7270374724c68960e1d5f5770bae44c5b067d940ed4d47157314c0946af5dd9cfc51980b552c79d52c0abbad2a790bc2df21a2a8b17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateparser \
python3.11dist-dateparser \
python311-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-pytz \
python311-regex \
python311-tzlocal \
update-alternatives"

inherit rpm
