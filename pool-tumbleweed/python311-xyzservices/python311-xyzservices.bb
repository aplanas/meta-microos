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

RPM_NAME = "python311-xyzservices-2022.9.0-1.7.noarch.rpm"
RPM_HASH = "c35b73df6d70853a0f855934cf7b1c182d2c12e54511d7ed9bb08b92e5f8eac2c72065e5737913d16d4eda44e9f72cba2c683b2a276818c107e530aec999745b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xyzservices \
python3.11dist-xyzservices \
python311-xyzservices \
python3dist-xyzservices"

RDEPENDS:${PN} += "python-abi \
xyzservices-data"

inherit rpm
