SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50419"

RPM_NAME = "texlive-webquiz-bin-2023.20230311.svn50419-93.1.aarch64.rpm"
RPM_HASH = "c67235fb24c441fd74acf82438105ac0a29d04b130a15e20aa8c5e3674642b3fc2440d60d3a59612e7cdc1382492b43d8f21c7bfb047bdb5296314352b46a526"

RPROVIDES:${PN} += "texlive-webquiz-bin"

RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
