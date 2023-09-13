SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-14.9.aarch64.rpm"
RPM_HASH = "c600f127d50c9fdf98899b39ff9ae116509acb87476e949db1922cbe450f7b7f083e7cb9dc0f990a9fd16a6b388c89ba5bea3ec742883d6796d3b4e8c29cf696"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
