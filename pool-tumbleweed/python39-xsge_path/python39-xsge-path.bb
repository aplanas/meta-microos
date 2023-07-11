SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-xsge_path-1.0.2-1.8.noarch.rpm"
RPM_HASH = "97f7fd985717060eb7131b7ec300bc1c1c53518d4977eef13c88146e6ef739b656359e6e5e349b42c475f7a6cc73f1d4126be13ed98a9c83d1df2693d9be473a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-path \
python39-xsge-path \
python3dist-xsge-path"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame"

inherit rpm
