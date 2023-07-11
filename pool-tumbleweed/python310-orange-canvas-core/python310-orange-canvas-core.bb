SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python310-orange-canvas-core-0.1.18-1.14.noarch.rpm"
RPM_HASH = "6ec84b21a32f2fa035301d18344106f3cf0b241c258acdd6c3308f979ffb55fc8c9c932e30912750ace1dde26053fb8006b2fa47e980358070449e239551a35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-orange-canvas-core"

RDEPENDS:${PN} += "python310-AnyQt \
python310-CacheControl \
python310-commonmark \
python310-dictdiffer \
python310-docutils \
python310-qt5 \
python310-requests"

inherit rpm
