SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python39-orange-canvas-core-0.1.18-1.14.noarch.rpm"
RPM_HASH = "625791f783cd79d913d4cff88006dcb7928697a76322a12a07541169f21b7cdf58cd083a64d06d05e6bccf20d9a3dd187099c3bdd2a43d3b9167ae92bc477431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-orange-canvas-core"

RDEPENDS:${PN} += "python39-AnyQt \
python39-CacheControl \
python39-commonmark \
python39-dictdiffer \
python39-docutils \
python39-qt5 \
python39-requests"

inherit rpm
