SUMMARY = "Desktop Backup Client based on BorgBackup"
DESCRIPTION = "Vorta is a backup client for Linux desktops. It integrates BorgBackup with \
the desktop environment to protect data from disk failure, \
ransomware and theft."
LICENSE = "GPL-3.0-only"

PV = "0.8.12"

RPM_NAME = "vorta-0.8.12-1.1.noarch.rpm"
RPM_HASH = "ce5b71af17e3c7ad3e2bf2640ed77d425c341bf5d2ef178206cfdef9a01ddb1a60e032f3be602278bd85edc2546cac0792ec31632576cda45fd6e3a59287a4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vorta \
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
