SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.89-1.46.aarch64.rpm"
RPM_HASH = "cfaef58198a023840e3cdf6081fe0d81ae1bf05ba425809a0647857b36bdf0938b1721c195da1e4ae026a581eeab2a0c4da995fb02c34ba30e20de4a2a352b25"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
