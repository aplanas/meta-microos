SUMMARY = "needs-restarting compatibility with zypper"
DESCRIPTION = "provides compatibility to YUM needs-restarting command using zypper \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.64"

RPM_NAME = "zypper-needs-restarting-1.14.64-1.1.noarch.rpm"
RPM_HASH = "7f85113b019a6b1a1cc370b954a54074793b91d22498d3f7c668304c856f060a9f4662519634893154e385c7e7d7e6ab57434397516650c2be1ed40d09a990d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-needs-restarting"

RDEPENDS:${PN} += "/usr/bin/bash \
zypper"

inherit rpm
