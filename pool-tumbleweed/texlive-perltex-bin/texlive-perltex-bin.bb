SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16181"

RPM_NAME = "texlive-perltex-bin-2023.20230311.svn16181-92.1.aarch64.rpm"
RPM_HASH = "c48ef464118040891b73bc2a82aa40bdd399fa20aa7d372f76bdb6cb598c825dbc4c508918e9ce9821db69b51bbdde032f073046e3c1939cccbd2bd87be46070"

RPROVIDES:${PN} += "texlive-perltex-bin"

RDEPENDS:${PN} += "texlive-perltex"

inherit rpm
