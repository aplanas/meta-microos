SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python39-rt-3.0.4-1.5.noarch.rpm"
RPM_HASH = "d807c37441a33d76fd3eb90ceeb7bbbd237eb094cede14d6e6d34548401dc46e3b14dac88c0a6a4ce57e772385b544517efcf016d3fca57f3daab0ad6a546758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rt \
python39-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
