SUMMARY = "Automatic dependency generator for QML files and modules"
DESCRIPTION = "Automatic dependency generator for QML files and modules. \
If installed, rpm uses this to generate Requires of .qml files \
and Provides of QML modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "qml-autoreqprov-1.2-1.1.noarch.rpm"
RPM_HASH = "73b54cae0d47ac83e4557a618154d30150f81a9f81295362ab9e843871110c9afc84d3080dbb552e90b65da6b02b93eb3cc5468b930c771f100f6b1fe4f6e0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qml-autoreqprov"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
rpm"

inherit rpm
