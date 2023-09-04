SUMMARY = "Password storage implementation based on KDE Wallet"
DESCRIPTION = "Password storage implementation based on KDE Wallet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0001"

RPM_NAME = "perl-Passwd-Keyring-KDEWallet-1.0001-1.13.noarch.rpm"
RPM_HASH = "2521bcb2bb59ac7f54ceb3db06e8914c008793ce0823601bfa3881a9cd8657d9502a2c78dd7d535ce12b40e0058a5e2951dd6434aebfecfff19baeab5e665cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Passwd--Keyring--KDEWallet \
perl-Passwd-Keyring-KDEWallet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir \
perl-Net--DBus \
perl-Proc--SyncExec \
perl-Try--Tiny"

inherit rpm
