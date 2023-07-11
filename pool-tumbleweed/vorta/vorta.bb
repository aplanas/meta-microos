SUMMARY = "Desktop Backup Client based on BorgBackup"
DESCRIPTION = "Vorta is a backup client for Linux desktops. It integrates BorgBackup with \
the desktop environment to protect data from disk failure, \
ransomware and theft."
LICENSE = "GPL-3.0-only"

PV = "0.8.12"

RPM_NAME = "vorta-0.8.12-1.2.noarch.rpm"
RPM_HASH = "185210071220ab8c4e15d3f8805d763c7479259380640cae63196fa2f3595b2a71957cdf0b76597e5352295e0e87b68474d4cb1ec5dce44623c6433f31d7cd4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vorta \
python3dist-vorta \
vorta"

RDEPENDS:${PN} += "/usr/bin/python3 \
borgbackup \
python-abi \
python3-APScheduler \
python3-QDarkStyle \
python3-keyring \
python3-peewee \
python3-platformdirs \
python3-psutil \
python3-python-dateutil \
python3-qt5"

inherit rpm
