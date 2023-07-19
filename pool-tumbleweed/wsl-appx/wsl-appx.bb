SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.627.aarch64.rpm"
RPM_HASH = "e3128d901e87b6de3a06e1f3701e0529f9c70c571b841fb835a560f380312ebd999f1edd66c53bce9a3bc2fa01546c2424e77c6a5aa46b4c1a7650a5887601e8"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
