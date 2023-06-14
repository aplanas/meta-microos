SUMMARY = "YaST2 - Online Update (YOU)"
DESCRIPTION = "Desktop files for YaST2 online update"
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-online-update-frontend-4.6.1-1.1.noarch.rpm"
RPM_HASH = "5d3f84a9ad77f56b90621a363c97fba49daf57596ffdb725bdfb2aa163ab88de5e70fc153bdd41e3db42adde33994bca88bfaef85e217d5b80c382b25274a5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-online-update-frontend"

RDEPENDS:${PN} += "yast2-online-update"

inherit rpm
