SUMMARY = "Source of XYZ tiles providers"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static."
LICENSE = "BSD-3-Clause"

PV = "2022.9.0"

RPM_NAME = "python39-xyzservices-2022.9.0-1.7.noarch.rpm"
RPM_HASH = "10e232d89299ace3317c26038d2dcde986386ef0900afc7cc94183f4efa186af1180bab5301c1cdebb6cc0f1bf736f22321520b1e0cbf407e5365ca0a2e2a8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xyzservices \
python39-xyzservices \
python3dist-xyzservices"

RDEPENDS:${PN} += "python-abi \
xyzservices-data"

inherit rpm
