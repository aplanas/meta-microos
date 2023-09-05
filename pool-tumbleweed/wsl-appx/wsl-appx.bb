SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-14.4.aarch64.rpm"
RPM_HASH = "b195c1d03c86e1cda04e294ea1c1eed9293b28eea6248a35cfb5fe09a4396403467716ea7ae270c88bc147ed997cda3e785bd65af5f74a89f4f007eb511e7df8"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
