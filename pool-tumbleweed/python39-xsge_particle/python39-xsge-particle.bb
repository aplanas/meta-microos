SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python39-xsge_particle-1.0-1.8.noarch.rpm"
RPM_HASH = "3508538edf6c1388c6bfd7645af3ca659428f874e6ac12c0fd0a8ea67cea8f65f799a167b147cd42286d1cfb10b692de695e83aa0a69585584aee231e69817fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-particle \
python39-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
