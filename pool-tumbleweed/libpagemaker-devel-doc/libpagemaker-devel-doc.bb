SUMMARY = "Documentation for the libpagemaker API"
DESCRIPTION = "This package contains documentation for the libpagemaker API."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-doc-0.0.4-1.30.noarch.rpm"
RPM_HASH = "5c5920032f72f34ccbd6afd46dd3f0aa401946732c15f32e5a4d167e11e53a69f9b2802574ec06bafcf852305e3d351e28d1ce63d0858bccbba219eabe6be306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpagemaker-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
