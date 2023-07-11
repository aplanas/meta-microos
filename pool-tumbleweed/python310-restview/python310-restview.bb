SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python310-restview-3.0.0-2.6.noarch.rpm"
RPM_HASH = "39578236c765888f0f8abbda74ceffab91cd69cbe95b08a39411c30b5dfbd59d3f565417775b25ee7dbc22b1ca34748f4c1c5f49b42ac7871de5f88425198c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-restview \
python310-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-pygments \
python310-readme-renderer \
update-alternatives"

inherit rpm
