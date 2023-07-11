SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python310-rnc2rng-2.6.6-1.13.noarch.rpm"
RPM_HASH = "e9f4ede03f2277af05803801393fc86acde2d1994efd2ef599a33c65b19c4a337dc8af2b8b8758dca9cc623faff960d9a5e00d7ab25e6cd96c90873069b62e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rnc2rng \
python310-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-rply \
update-alternatives"

inherit rpm
