SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10843"

RPM_NAME = "texlive-pax-bin-2023.20230311.svn10843-93.1.aarch64.rpm"
RPM_HASH = "c0f1c65b611b62456b14dcd8549d05dbd5db374f6c14746d613db1bb4143b65942dc91ab0a7ee438bf4af8156c164326ffd2097c48c65f9b79f9f9656169c70a"

RPROVIDES:${PN} += "texlive-pax-bin"

RDEPENDS:${PN} += "texlive-pax"

inherit rpm
