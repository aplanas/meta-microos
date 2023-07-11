SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python310-Glymur-0.11.3-1.6.noarch.rpm"
RPM_HASH = "74715dd265632837434b788be6be7eafc7b4b47f54eab27efc855e47533914d0f3c427031f009d365495999ef013ab22da2baa870b3394d1ac930af4b656006c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glymur \
python310-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-lxml \
python310-numpy \
python310-packaging \
update-alternatives"

inherit rpm
