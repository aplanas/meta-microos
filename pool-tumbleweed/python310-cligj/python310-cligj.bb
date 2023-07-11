SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python310-cligj-0.7.2-1.7.noarch.rpm"
RPM_HASH = "2e9c7193f4941f0fdbac8fea1756da17f5e309cd630be66aa31be644583c586bcc18856507f12f025bbaf4da6b060547f75161ee63c4880bffb068166ca32bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cligj \
python310-cligj \
python3dist-cligj"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
