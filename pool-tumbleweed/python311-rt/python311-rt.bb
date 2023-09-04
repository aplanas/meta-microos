SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.7"

RPM_NAME = "python311-rt-3.0.7-1.1.noarch.rpm"
RPM_HASH = "7fc964d4b0100eb3671f041502ce1c8268ef2fc6a0c4b97a599863e0cb4cbf0bcfdef21e3c006ec1f837eef6be37a91a494a8122e7d49e690281faeeb856fcee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt \
python3.11dist-rt \
python311-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-requests-toolbelt"

inherit rpm
