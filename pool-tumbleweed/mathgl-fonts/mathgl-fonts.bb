SUMMARY = "Fonts for the MathGL library"
DESCRIPTION = "This package contains command fonts for MathGL library."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-fonts-8.0.1-4.2.noarch.rpm"
RPM_HASH = "6c83df71160a7611e1f856dbf6a63b25c160cc3ad79f93aaef0d6e10afecf83649acb309f565c4018a9416118e2da42801d2af284f92912ccacb68bce12fd912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-fonts"

RDEPENDS:${PN} += ""

inherit rpm
