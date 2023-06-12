SUMMARY = "Show-leaves Plugin for DNF"
DESCRIPTION = "Show-leaves Plugin for DNF, Python 3 version. List all installed \
packages that are no longer required by any other installed package \
after a transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-show-leaves-4.3.1-2.1.noarch.rpm"
RPM_HASH = "fb0b8704e2a6a4d9cefceb267fcbfb23fcd727addc4b73eff02af89403c135aff1018c0c85ebbf1351b6ee9f6ab712f87f5132c6e97833d146bad858c7bd51d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command(show-leaves) \
dnf-plugin-show-leaves \
dnf-plugins-extras-show-leaves \
python3-dnf-plugin-show-leaves \
python3-dnf-plugins-extras-show-leaves"
RDEPENDS:${PN} += "python(abi) \
python3-dnf-plugin-leaves \
python3-dnf-plugins-core"

inherit rpm
