SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-agate-dbf-0.2.2-1.12.noarch.rpm"
RPM_HASH = "79833f7180eac85a5b680b4af983728f21b33f41a90c77032e2fe065d8bd42041d3b5259271c4509164da6bf0245ce4091c9be41f885cfda416bf7856c9657d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-dbf \
python3.11dist-agate-dbf \
python311-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-dbfread"

inherit rpm
