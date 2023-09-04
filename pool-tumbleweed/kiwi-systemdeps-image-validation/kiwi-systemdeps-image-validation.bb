SUMMARY = "KIWI - host requirements for handling image descriptions better"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to handling image descriptions better. This also \
includes reading of image descriptions for different markup \
languages"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-image-validation-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "e54be79a398b55755b3c48d51ba4925bd005bc0eff6c2342ee1243f9c64c1c0df7b1dd4f40450765bf8540f380a9b2e11928093b4d99593add2d22c94ae00652"

RPROVIDES:${PN} += "kiwi-systemdeps-image-validation"

RDEPENDS:${PN} += "python3-solv"

inherit rpm
