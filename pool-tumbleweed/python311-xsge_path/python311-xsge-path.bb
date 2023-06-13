SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-xsge_path-1.0.2-1.7.noarch.rpm"
RPM_HASH = "170ba563cfb847a863ae3dbf946dcf45de8bc259f31133f1c8c3b97c2f5fcf9a76a8e830c67edf4972c493bbe7341fb6f74d5903fb05adf1352565eeed7ef015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-path) \
python311-xsge_path \
python3dist(xsge-path)"

RDEPENDS:${PN} += "python(abi) \
python311-sge-pygame"

inherit rpm
