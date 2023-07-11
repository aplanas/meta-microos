SUMMARY = "Examples for python311-qtcharts-qt5"
DESCRIPTION = "This package provides python311-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-doc-5.15.6-1.14.noarch.rpm"
RPM_HASH = "bc9b113ed2c27488a709677b2d37a9cdec4dbccfed30c3436a18e617b6a54a5a7d9f8969ec9cafda81ec601f04f42a7fb035a756eec401c83008f491bae1a858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtcharts-qt5-doc \
python310-qtcharts-qt5-examples \
python311-qtcharts-qt5-doc \
python311-qtcharts-qt5-examples \
python39-qtcharts-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
