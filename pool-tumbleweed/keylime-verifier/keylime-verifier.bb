SUMMARY = "Keylime verifier service"
DESCRIPTION = "Subpackage of keylime for verifier service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-verifier-7.2.5-1.3.noarch.rpm"
RPM_HASH = "64f3c2248582cdedb566320fcf8525df8d4e1b857f926b8ccf8183691a6ed6e3d22ea24add7c657e8aed137b68602d6724a73922acb95160a70ce114aed58931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-verifier"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
