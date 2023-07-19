SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25623"

RPM_NAME = "texlive-checkcites-bin-2023.20230311.svn25623-93.1.aarch64.rpm"
RPM_HASH = "c5565185b8d5806e2b9e0ddb6405b606caf0ad589bcab778ec2527dae68f57ae0bb876bb28b206dd5b7a41ef7bd3e5e1d26718695647c553ae582c487a69503a"

RPROVIDES:${PN} += "texlive-checkcites-bin"

RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
