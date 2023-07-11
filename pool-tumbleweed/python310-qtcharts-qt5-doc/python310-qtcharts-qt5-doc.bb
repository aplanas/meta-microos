SUMMARY = "Examples for python310-qtcharts-qt5"
DESCRIPTION = "This package provides python310-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-doc-5.15.6-1.14.noarch.rpm"
RPM_HASH = "e9d7086f2dd3f31fca9d4dab52f3e6e08d80ad2f96512970e99d4a846b91a0c6eb3cd9a959e8ea0fc0830c7d963992046c320c3cadb3f4540383d6e37f415f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtcharts-qt5-doc \
python310-qtcharts-qt5-examples \
python311-qtcharts-qt5-examples \
python39-qtcharts-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
