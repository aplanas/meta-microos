SUMMARY = "KIWI - host requirements for handling image descriptions better"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to handling image descriptions better. This also \
includes reading of image descriptions for different markup \
languages"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-image-validation-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "05f2f62ed2d18aae61f90223ed08596d5b9eb95277ce86f6c699cc0bafcb4016019873fa4aa0fdd53edc9f644f5204ba617303f13ca79ee67a65fc9d8fd04878"

RPROVIDES:${PN} += "kiwi-systemdeps-image-validation"

RDEPENDS:${PN} += "python3-solv"

inherit rpm
