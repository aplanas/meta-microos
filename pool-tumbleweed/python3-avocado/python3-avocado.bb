SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-69.0-6.10.noarch.rpm"
RPM_HASH = "5b22f0b225b1408a002fa9fee72f14fa3da241d59afd53b9fe74861b9655d70a122069dd7f831e7c402ff048872fafc1b8030bfedd1655e0a701c0c8a9718900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado \
python3-avocado \
python3.10dist-avocado-framework \
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
