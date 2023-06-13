SUMMARY = "JSON based configuration file manager for Python"
DESCRIPTION = "JSON based configuration file manager for Python 3.x."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "python3-gmconfig-1.0.1-1.11.noarch.rpm"
RPM_HASH = "cbd72181c325bf095f4bc159cd31cd786ede547677346d12a286676074e0ed2d410c8bdc310f71a2248be4f53c2f7cbc5fc64f8072dec0a9b1aee4fd421d7154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gmconfig \
python3.10dist(gmconfig) \
python3dist(gmconfig)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
