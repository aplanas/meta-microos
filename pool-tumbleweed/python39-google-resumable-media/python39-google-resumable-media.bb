SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python39-google-resumable-media-2.5.0-1.3.noarch.rpm"
RPM_HASH = "1d55bb06a8252cc08f6cb48b6c5a499c63c5a35693317f2a7cc852dba4a9cb6ff11cc59a68cee67a9af17fcd453761370ae459e7032731a5d243c90ded8ec2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-resumable-media \
python39-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python39-google-crc32c"

inherit rpm
