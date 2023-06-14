SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16181"

RPM_NAME = "texlive-perltex-bin-2023.20230311.svn16181-91.1.aarch64.rpm"
RPM_HASH = "4d5fc878b52c04828002ab57dc4a2ae95d6ed35120021b32f57bb6b5bee720d933c72aaffd66919dd39555b3070fafc53cc438a15de10bdf11479e2c795f83ab"

RPROVIDES:${PN} += "texlive-perltex-bin"

RDEPENDS:${PN} += "texlive-perltex"

inherit rpm
