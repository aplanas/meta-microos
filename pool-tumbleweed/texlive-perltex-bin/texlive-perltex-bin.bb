SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16181"

RPM_NAME = "texlive-perltex-bin-2023.20230311.svn16181-93.1.aarch64.rpm"
RPM_HASH = "befceafc31822aab8f47a05b51381faf0f096d94cd35a9a10ff1632c6f7961ba781688091143129dee113e69479f905a909c144a72131d855409f71d267ae244"

RPROVIDES:${PN} += "texlive-perltex-bin"

RDEPENDS:${PN} += "texlive-perltex"

inherit rpm
