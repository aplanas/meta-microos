SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python310-yaswfp-0+git.1411687316.2a2cc6c-1.9.noarch.rpm"
RPM_HASH = "11e878ce6248ca6809c3f8cadcd5c01883f6cb75108a9dbe74093568335bcb75c8d914550221a24fa35dcafb7e018014447cf35c5b08c913b139ede8eb2d45d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaswfp \
python3.10dist(yaswfp) \
python310-yaswfp \
python3dist(yaswfp)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm
