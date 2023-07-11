SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-beren-0.7.1-3.8.aarch64.rpm"
RPM_HASH = "aa654be68a3f00ddf5a8e86e46a844c0945e6ddbb4eae5dde17d4eb512e02f71ee3ecdc9ba420d42facd8548ebb1050538c1f5a0d9ae95b9a17155cd4603d176"

RPROVIDES:${PN} += "python3-beren \
python3.11dist-beren \
python311-beren \
python3dist-beren"

RDEPENDS:${PN} += "python-abi \
python311-apiron"

inherit rpm
