SUMMARY = "Integration module for Orthanc"
DESCRIPTION = "This package provides the interface to Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "gnuhealth-orthanc-4.2.1-1.1.noarch.rpm"
RPM_HASH = "0cfb53e6a2cc313bc58ba34afb5c9434705c09f10bc69cdea3225435cdb18782b161a8562ccd0bf28327eaae1ecea04aed1b472cdf6a598f55c26a29134bc4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-orthanc \
python3.10dist(gnuhealth-orthanc) \
python3dist(gnuhealth-orthanc)"

RDEPENDS:${PN} += "gnuhealth \
python(abi) \
python3-beren \
python3-pendulum"

inherit rpm
