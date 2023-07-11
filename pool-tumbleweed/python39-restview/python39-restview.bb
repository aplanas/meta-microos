SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python39-restview-3.0.0-2.6.noarch.rpm"
RPM_HASH = "67435b7e4d10678ca8dcbb52dc78d308be330f102c43ebde7b635f95d3030a615d972a1847aec0da9a5a34b12f55693ef6f6fe587daf0fa1cc4cd92407da08a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-restview \
python39-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-pygments \
python39-readme-renderer \
update-alternatives"

inherit rpm
