SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-agate-remote-0.2.1-1.5.noarch.rpm"
RPM_HASH = "82245dac4b8b8dc5533d30310523caa26faf177fa41b568714275848164f9d23297a321e7f1638f8eefbaa4ce81b6ae60f2823d2b2024c8f9abfa544a8d4f71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-remote \
python3.11dist-agate-remote \
python311-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-requests"

inherit rpm
