SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains several systemtap scripts to allow detailed \
manual monitoring of the system. Instead of the typical IO/sec it collects \
minimal, maximal and average time between operations to be able to \
identify applications that behave power inefficient (many small operations \
instead of fewer large ones)."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-utils-systemtap-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "f76b2b99719d7ede015282c0e5021fcf7a41a269b0c478a938c7324010ccc876376e8b8f63eaf157fd7f0c0a0c2d4e49d82de58d7d55d474998072d0b0092c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils-systemtap"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/stap \
systemtap \
tuned"

inherit rpm
