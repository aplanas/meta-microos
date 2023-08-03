SUMMARY = "needs-restarting compatibility with zypper"
DESCRIPTION = "provides compatibility to YUM needs-restarting command using zypper \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.62"

RPM_NAME = "zypper-needs-restarting-1.14.62-1.1.noarch.rpm"
RPM_HASH = "1ef85afd97d4070a7f5530ccde42a08cb3dc7d6edcf67653a784e0303b65dc90fe2ec7173a81ca04b966f5dd1272208e318714e26d5c01d9855ace459d1b1536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-needs-restarting"

RDEPENDS:${PN} += "/usr/bin/bash \
zypper"

inherit rpm
