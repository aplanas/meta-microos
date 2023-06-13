SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "2.2.3"

RPM_NAME = "python310-lazr.config-2.2.3-1.8.noarch.rpm"
RPM_HASH = "89336840578ce8f25172ecd7eea03064e83c4c714a73d8818e1549d8aad535412050c2980fedb62abcc79e118fdac6eac0069aa969ca1894881d84f15f582e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.config \
python3.10dist(lazr.config) \
python310-lazr.config \
python3dist(lazr.config)"

RDEPENDS:${PN} += "python(abi) \
python310-lazr.delegates \
python310-zope.interface"

inherit rpm
