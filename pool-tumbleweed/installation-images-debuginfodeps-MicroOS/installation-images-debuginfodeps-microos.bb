SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.90-1.30.aarch64.rpm"
RPM_HASH = "758155d731347d1fdc577f5cf23ea846b0d812c64a6ea2753e2faf9e959708815747e81e31305d302b633e1d57e05df95866de5108ab26ac919f735591240305"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
