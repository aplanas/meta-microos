SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python39-dropbox-10.4.1-2.8.noarch.rpm"
RPM_HASH = "5db53b1d237bce3ce45084236b5b0c3aba836e49370a694c561d9afd70a0aa80bcf68d4b10448731984a42e20b9554d1a6b075eff994fd76f08aceb9481944ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dropbox) \
python39-dropbox \
python3dist(dropbox)"
RDEPENDS:${PN} += "python(abi) \
python39-requests \
python39-six"

inherit rpm
