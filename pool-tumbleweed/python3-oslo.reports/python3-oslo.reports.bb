SUMMARY = "OpenStack oslo.reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-oslo.reports-2.4.0-1.4.noarch.rpm"
RPM_HASH = "65a4cf3637ac6ffc039ec32397b88d4d7be9af86b6d1f47ce9ad706d10f41ff8219279c724bc247a3725f72d75db2f033313b747970a6d2df13e3ae4f005d400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.reports \
python3.10dist-oslo.reports \
python3dist-oslo.reports"

RDEPENDS:${PN} += "python-abi \
python3-Jinja2 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-psutil"

inherit rpm
