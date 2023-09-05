SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "5233654f48e4ad5ca507ffe092e06ed94784796ff6104aab349e8ed8d7a747a6b668fcb08f1acb7a75761bfc4228ebaeb954e3b63762e7c4081749c6cda383c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-space-flares \
plymouth-scripts"

inherit rpm
