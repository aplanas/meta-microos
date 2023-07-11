SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains utilities that can help you to fine tune your \
system and manage tuned profiles."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-utils-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "eeb17ee94cb8a25edb9c02a0244ef4d3f3ab3b95c676078375f476423ca91e70be13ef69271588905cf43efc53392a33af4bd903b11c01c3082aaf103a526efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
tuned"

inherit rpm
