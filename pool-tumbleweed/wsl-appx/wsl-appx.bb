SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-14.5.aarch64.rpm"
RPM_HASH = "ffe45de44f3518acca21dce57929806b97bd700e89832b63e36e8398a078c2c09f14710b1cc4d720342cfcc34a103c9db931ffec4a90e584f0be8acf69181ba4"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
