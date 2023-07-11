SUMMARY = "Disk and net statistic monitoring systemtap scripts - GTK GUI"
DESCRIPTION = "GTK GUI that can control tuned and provide simple profile editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-gtk-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "d824694b1a1e037181f50bfceed0aa7e376a77958ce654c081814dcedc820289ec8bf7d9f280206d5a37f8998139998d351e6d2547b7c800bbda5fd8703a08d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
python-abi \
tuned"

inherit rpm
