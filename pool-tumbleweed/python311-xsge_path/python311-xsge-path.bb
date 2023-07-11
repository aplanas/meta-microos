SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-xsge_path-1.0.2-1.8.noarch.rpm"
RPM_HASH = "e3fe22dfc7f33a6a1cba05322e8743422124325d4633188d809a892b5c439228da5e12a7f9bd8301993e60ed96c7e040245009d19fbd38e76109673505c3d0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-path \
python3.11dist-xsge-path \
python311-xsge-path \
python3dist-xsge-path"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame"

inherit rpm
