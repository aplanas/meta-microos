SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2023.20230311.svn23406-93.2.aarch64.rpm"
RPM_HASH = "65c5b30e36b2fe125284e061554a4852fd7951d037bc2351b6676df2f4cd339e3036f1e12388578dcf275dc1c6ef595bb2e6c43ce7c399a0e3ed220d0fc0f13c"

RPROVIDES:${PN} += "texlive-mf2pt1-bin"

RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
