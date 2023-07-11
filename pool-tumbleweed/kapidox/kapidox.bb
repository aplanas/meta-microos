SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "5.107.0"

RPM_NAME = "kapidox-5.107.0-1.2.noarch.rpm"
RPM_HASH = "1c59ee1835eee4556e5770ec50308aa5d9880935966a0c56f24e8c3ae8ffa70974fa4093fe56f35cc7663429858a7455b737097f5af51ae0b424fcb76c7db5ef"
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
