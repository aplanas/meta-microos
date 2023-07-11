SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-69.0-6.11.noarch.rpm"
RPM_HASH = "b39e1db7dbbd82cc59e2c56f1efe67b2760741e118cb05da012502664d3ac65e4a489134f92e196602989f13e0123c7c03a3ecd73e1d79fc9399a061fb9d39fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado \
python3-avocado \
python3.11dist-avocado-framework \
python3dist-avocado-framework"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
avocado-common \
gdb \
procps \
python-abi \
python3-Fabric \
python3-requests \
python3-setuptools \
python3-six \
python3-stevedore \
update-alternatives"

inherit rpm
