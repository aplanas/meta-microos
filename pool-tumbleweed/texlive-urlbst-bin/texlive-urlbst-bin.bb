SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23262"

RPM_NAME = "texlive-urlbst-bin-2023.20230311.svn23262-91.1.aarch64.rpm"
RPM_HASH = "dcd2a857c083a754bf64016f02b4579e8d597c1a68d6b1d011b3e956a93cfa93a3f9667468e54e3897e608ff8b37bea3026de659d2b9ce5cf332ad4e1474c59e"

RPROVIDES:${PN} += "texlive-urlbst-bin \
texlive-urlbst-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
