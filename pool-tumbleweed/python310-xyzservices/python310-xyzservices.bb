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

RPM_NAME = "python310-xyzservices-2022.9.0-1.7.noarch.rpm"
RPM_HASH = "72b81248971de64ccb1870db434308c81e47e82ccad00a4e457c8ff6aa9675f8db75690a00f0009ccdc18eddcb805b926715ca1f07ad18e01a5bcb3b1089f86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xyzservices \
python310-xyzservices \
python3dist-xyzservices"

RDEPENDS:${PN} += "python-abi \
xyzservices-data"

inherit rpm
