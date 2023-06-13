SUMMARY = "KIWI - host requirements for handling image descriptions better"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to handling image descriptions better. This also \
includes reading of image descriptions for different markup \
languages"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-image-validation-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "656c918de0be7660ef2a21a5b7773328d3d7cc095b5c03729de9e658a30681b86ce2e25457c7746079a4034d0c85ed8f62348e55ac757f702547f6312bdcd105"

RPROVIDES:${PN} += "kiwi-systemdeps-image-validation \
kiwi-systemdeps-image-validation(aarch-64)"

RDEPENDS:${PN} += "python3-solv"

inherit rpm
