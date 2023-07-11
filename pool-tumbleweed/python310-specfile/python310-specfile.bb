SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-specfile-0.18.0-1.3.noarch.rpm"
RPM_HASH = "50056e6b350af4cac7a28e3eedcbfbd77500b03a37c87f0babc6733ec5bf7afd80da384e8dcae2db36826029f144d9c2be14a92215e054ed65865b9c8936c6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-specfile \
python310-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python310-rpm"

inherit rpm
