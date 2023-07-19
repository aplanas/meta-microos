SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13364"

RPM_NAME = "texlive-pkfix-bin-2023.20230311.svn13364-93.1.aarch64.rpm"
RPM_HASH = "31bde6fd9db4990c38dc45063465bb4bc7a09a85c6953e5193e11bb18978dffe2ae5bd469280941291e257ed38266f6a9ab095219790b13990da55499f325694"

RPROVIDES:${PN} += "texlive-pkfix-bin"

RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
