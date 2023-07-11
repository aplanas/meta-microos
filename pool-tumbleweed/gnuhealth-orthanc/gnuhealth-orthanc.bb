SUMMARY = "Integration module for Orthanc"
DESCRIPTION = "This package provides the interface to Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "gnuhealth-orthanc-4.2.1-1.3.noarch.rpm"
RPM_HASH = "cc90267c10e0336fc3f55f8f8ea062a1a66d824402b58dfd5158e35e22cd903746b02402a2223dbc1ea15d337e485ba4f095792a8bcd695b60c921ad75380ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-orthanc \
python3.11dist-gnuhealth-orthanc \
python3dist-gnuhealth-orthanc"

RDEPENDS:${PN} += "gnuhealth \
python-abi \
python3-beren \
python3-pendulum"

inherit rpm
