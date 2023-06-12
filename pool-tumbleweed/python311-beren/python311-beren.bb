SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-beren-0.7.1-3.6.aarch64.rpm"
RPM_HASH = "2aff1edc47fe98247484f23eed34cb123addae009f616b566ef3b5f32f08db134c7e643d742dc68d804909456e13201234348d0e8cf82807086be1f11b28457a"

RPROVIDES:${PN} += "python3.11dist(beren) \
python311-beren \
python311-beren(aarch-64) \
python3dist(beren)"
RDEPENDS:${PN} += "python(abi) \
python311-apiron"

inherit rpm
