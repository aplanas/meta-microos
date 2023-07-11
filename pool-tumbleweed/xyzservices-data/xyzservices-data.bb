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

RPM_NAME = "xyzservices-data-2022.9.0-1.7.noarch.rpm"
RPM_HASH = "13527e23a15d5e6ad460376fd217e3e042806d4b2be8a560be268f23e68000e8e377c6e8796f5a1ed5286273724b6da399bafdb0388fd146b6afcda415b2ad81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyzservices-data"

RDEPENDS:${PN} += ""

inherit rpm
