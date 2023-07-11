SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python311-rnc2rng-2.6.6-1.13.noarch.rpm"
RPM_HASH = "5120dd3b147ac9740e96230ac86ff2db719e7cc29cb31a71e8f5085516eeaf288c4ae60e68005fed1fb1af65009f819fe95ba3c046aefc42e99b2224d0c992fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnc2rng \
python3.11dist-rnc2rng \
python311-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-rply \
update-alternatives"

inherit rpm
