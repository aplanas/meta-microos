SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2023.20230311.svn23406-93.1.aarch64.rpm"
RPM_HASH = "7af9ea7de0b62956f055ef02b74de9f6835aff3a1d7393ed3dac0e8ff381841c41517c3e8462996d8cd58cff1a3ec896945b716c51e84f565a613d1ece8d640a"

RPROVIDES:${PN} += "texlive-mf2pt1-bin"

RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
