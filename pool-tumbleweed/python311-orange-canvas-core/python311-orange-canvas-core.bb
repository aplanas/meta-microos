SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python311-orange-canvas-core-0.1.18-1.13.noarch.rpm"
RPM_HASH = "a6ede6a68dcc6f7e60ca2589fc59f6a0563deb19cb11eef65d290843c615faaf2a1687c198c6fe4ea036aed058491fc1cd3fa3a1e3946118a8633971edfe9084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-orange-canvas-core \
python311-orange-canvas-core \
python3dist-orange-canvas-core"

RDEPENDS:${PN} += "python-abi \
python311-AnyQt \
python311-CacheControl \
python311-commonmark \
python311-dictdiffer \
python311-docutils \
python311-qt5 \
python311-requests"

inherit rpm
