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

RPM_NAME = "python311-xyzservices-2022.9.0-1.5.noarch.rpm"
RPM_HASH = "5ce77ea24f63266bea88403f88cffe6b7752667eb189646a1b1bfd93d1245d5d3a0d3426a9dc2a2477399d1fc51a45d202ce51b0f00acbd9d46904a952bc47ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xyzservices) \
python311-xyzservices \
python3dist(xyzservices)"
RDEPENDS:${PN} += "python(abi) \
xyzservices-data"

inherit rpm
