SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2023.20230311.svn23406-92.1.aarch64.rpm"
RPM_HASH = "9d8ed714b8017095ea22d00bf300d317632755716ec95300b86aa4d2c3c0aa7c4810718e02beead1e31dc079d5a4cb86f5e9d2f041cff8420e98b327beec50b1"

RPROVIDES:${PN} += "texlive-mf2pt1-bin"

RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
