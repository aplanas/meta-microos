SUMMARY = "[global] extra for python310-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-global-1.2.4-1.6.noarch.rpm"
RPM_HASH = "f50286a0b75abc90999a012d91fc0f4af74856b4c810edce5df8e7b39274f8e40afce06c42bdb067b262bdb8c4969d9f091ff0477842d98960accd2eadb47c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytoolconfig-global"

RDEPENDS:${PN} += "python310-platformdirs \
python310-pytoolconfig"

inherit rpm
