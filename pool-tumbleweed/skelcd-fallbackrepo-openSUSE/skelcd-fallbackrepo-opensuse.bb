SUMMARY = "Packages for openSUSE to include in fallback repository"
DESCRIPTION = "Packages to include in fallback repository for openSUSE. The fallback repository is \
part of the installation system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "skelcd-fallbackrepo-openSUSE-1.1-4.47.aarch64.rpm"
RPM_HASH = "ab0d9b7b1bfb3b099b16602b95d583b45a92f5e2c8b879fe09193668fb53edca18feb594f5c117722e433cde4561351110a98c8d29543f3ba30810af55ec7caa"

RPROVIDES:${PN} += "skelcd-fallbackrepo \
skelcd-fallbackrepo-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
