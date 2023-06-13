SUMMARY = "Source of XYZ tiles providers - common data package"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static. \
 \
This package provides the common compressed JSON file for the \
pythonXY-xyzservices packages."
LICENSE = "BSD-3-Clause"

PV = "2022.9.0"

RPM_NAME = "xyzservices-data-2022.9.0-1.5.noarch.rpm"
RPM_HASH = "1d31b84682a72ff288adec8031ffdba2a7b65d5f9f7bdd7c074eff74ab42017e1d89cef21cbc3c2dd30386e72a456b3bb95d3d36aacf3b22848750f57714e034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyzservices-data"

RDEPENDS:${PN} += ""

inherit rpm
