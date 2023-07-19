SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29036"

RPM_NAME = "texlive-arara-bin-2023.20230311.svn29036-93.1.aarch64.rpm"
RPM_HASH = "d73bcae46d043e9d753b81da0beaab88d674e9e62fac721fbb248f51ad1770bb4d11365123165246e36331d67ae5acaae2e20f884cc5702084916603a2523a92"

RPROVIDES:${PN} += "texlive-arara-bin"

RDEPENDS:${PN} += "texlive-arara"

inherit rpm
