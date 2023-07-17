SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "5.108.0"

RPM_NAME = "kapidox-5.108.0-1.1.noarch.rpm"
RPM_HASH = "8ee97c068f4b382008e9d34cf355a30c4a3ad0409ce1975274f0cd520ece920a58b4cccf6bc26723f47070320f92df591ab0adfba59932d6a7fa7a06f50b9ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapidox \
python3.11dist-kapidox \
python3dist-kapidox"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
doxygen \
graphviz \
graphviz-gd \
libqt5-qttools \
python-abi \
python3-Jinja2 \
python3-xml"

inherit rpm
