SUMMARY = "Show-leaves Plugin for DNF"
DESCRIPTION = "Show-leaves Plugin for DNF, Python 3 version. List all installed \
packages that are no longer required by any other installed package \
after a transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-show-leaves-4.3.1-2.2.noarch.rpm"
RPM_HASH = "147a2cc344b742494d142c3821adef68d6cec34f0208afa7c44734cc81744468cc5231e692e6bea943728436ad87f6d1f24ae271936a264414bab778d5fbb77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-show-leaves \
dnf-plugin-show-leaves \
dnf-plugins-extras-show-leaves \
python3-dnf-plugin-show-leaves \
python3-dnf-plugins-extras-show-leaves"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugin-leaves \
python3-dnf-plugins-core"

inherit rpm
