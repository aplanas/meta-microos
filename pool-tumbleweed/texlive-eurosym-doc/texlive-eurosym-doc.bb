SUMMARY = "Documentation for texlive-eurosym"
DESCRIPTION = "This package includes the documentation for texlive-eurosym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4_subrfixsvn17265"

RPM_NAME = "texlive-eurosym-doc-2023.209.1.4_subrfixsvn17265-53.1.noarch.rpm"
RPM_HASH = "9791deb50c34cede980f9db6fcf0f71250ff27358bef211a980d14a8190373fa310820eaceb7ec2241034b6351dafcfe93b1bd555a6f22f3b032e0d2aeebf2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eurosym-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
