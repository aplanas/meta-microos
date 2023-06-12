SUMMARY = "needs-restarting compatibility with zypper"
DESCRIPTION = "provides compatibility to YUM needs-restarting command using zypper \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de>"
LICENSE = "GPL-2.0+"

PV = "1.14.60"

RPM_NAME = "zypper-needs-restarting-1.14.60-1.1.noarch.rpm"
RPM_HASH = "d9cd3ee445af5c6fd0554c1989ce9bada9f1d9f4a3adb57f1d7768521effd566129a0046e3d30f8a44646f591fb61a840ab0a58cbc4b6eeace8602b2230fc956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-needs-restarting"
RDEPENDS:${PN} += "/bin/bash \
zypper"

inherit rpm
