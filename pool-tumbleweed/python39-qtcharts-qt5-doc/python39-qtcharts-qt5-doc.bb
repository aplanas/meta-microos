SUMMARY = "Examples for python39-qtcharts-qt5"
DESCRIPTION = "This package provides python39-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-doc-5.15.6-1.14.noarch.rpm"
RPM_HASH = "ab81df8442ddea79a419a5636e470ae9f58a9b7090170199e70f9c68d3ba59d36550e5fed9d0cca815ab90cd82159c82c46b8199464c10abcc6c27494a318780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtcharts-qt5-examples \
python311-qtcharts-qt5-examples \
python39-qtcharts-qt5-doc \
python39-qtcharts-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
