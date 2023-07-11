SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python311-importlib-metadata-6.6.0-1.3.noarch.rpm"
RPM_HASH = "2d5d5421bdc53415677c81def0dda257905ea7113c0165c048c9116719b8a680ddad67d4e76c38a04c5271471da7ea6a53193c1969ad9adffdeacc229de823b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-metadata \
python3.11dist-importlib-metadata \
python311-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python311-zipp"

inherit rpm
