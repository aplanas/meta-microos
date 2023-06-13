SUMMARY = "Common files for Extras Plugins for DNF"
DESCRIPTION = "Common files for Extras Plugins for DNF, Python 3 version."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugins-extras-common-4.0.17-2.1.noarch.rpm"
RPM_HASH = "3cb1fb0ec9fd0e400bb09c4e23a945ba999300ca630a85e862821f55b66e95362c6ff5cbf84066fe7e20a9092b7718cc20ce8d337437f0fb4841eaaa0b2241a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-extras-common \
python3-dnf-plugins-extras-common"

RDEPENDS:${PN} += "python(abi) \
python3-dnf"

inherit rpm
