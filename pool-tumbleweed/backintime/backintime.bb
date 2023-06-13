SUMMARY = "Backup tool for Linux inspired by the 'flyback project'"
DESCRIPTION = "Back In Time is a backup tool for Linux inspired by the 'flyback project'. \
 \
It provides a command line client 'backintime' and a Qt5 GUI 'backintime-qt' \
both written in Python3. \
 \
You only need to specify 3 things: \
    * where to save snapshots; \
    * what folders to backup; and \
    * backup frequency (manual, every hour, every day, every month)."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "backintime-1.3.3-2.1.noarch.rpm"
RPM_HASH = "7502a90bcae2f3fa81c61cf5fc89acb238154fc591644b8ec2a2a36c2a799684963e8e63bdb66476b587d10806b5e396038fc90589bec4f9284c30f2d2870fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backintime \
backintime-doc"

RDEPENDS:${PN} += "/bin/sh \
cron \
dbus-1-python3 \
libnotify-tools \
openssh \
pkexec \
python3 \
python3-keyring \
python3-packaging \
rsync"

inherit rpm
