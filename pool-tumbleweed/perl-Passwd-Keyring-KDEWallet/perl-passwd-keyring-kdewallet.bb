SUMMARY = "Password storage implementation based on KDE Wallet"
DESCRIPTION = "Password storage implementation based on KDE Wallet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0001"

RPM_NAME = "perl-Passwd-Keyring-KDEWallet-1.0001-1.12.noarch.rpm"
RPM_HASH = "b64a0978a1c54aa239ff2e1a38e7038a9907e4014bb2320a8909e834c0f9935224c6edc03638519d266cc53a1104516b636df325703fad1456ff67aa83b0b958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Passwd--Keyring--KDEWallet \
perl-Passwd-Keyring-KDEWallet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir \
perl-Net--DBus \
perl-Proc--SyncExec \
perl-Try--Tiny"

inherit rpm
