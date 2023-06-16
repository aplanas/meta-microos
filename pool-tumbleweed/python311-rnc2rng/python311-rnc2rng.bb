SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python311-rnc2rng-2.6.6-1.11.noarch.rpm"
RPM_HASH = "9a87c7aad36743918aab6e44eee4117d7cc84bd4e2226d918719634381827fa5496109a3ba150e9e22a8fc81a1111ea43d529da4d2751444ef74db025c1b598f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rnc2rng \
python311-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-rply \
update-alternatives"

inherit rpm
