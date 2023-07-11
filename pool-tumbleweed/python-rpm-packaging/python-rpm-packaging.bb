SUMMARY = "RPM dependency generator for Python"
DESCRIPTION = "Tools for packaging Python projects with rpm"
LICENSE = "GPL-2.0-or-later"

PV = "20210526+a18ca48"

RPM_NAME = "python-rpm-packaging-20210526+a18ca48-1.9.noarch.rpm"
RPM_HASH = "eb542466370fa3b8d20fb03b9ffd8611418976e79fc34ec83d8698f5319c716478cafa3a3b3e070c6708afe180c10fbfa0e0854643634361b78f3e009ffb9639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-packaging \
rpm-build-python"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
python-rpm-macros \
python3-base \
python3-packaging"

inherit rpm
