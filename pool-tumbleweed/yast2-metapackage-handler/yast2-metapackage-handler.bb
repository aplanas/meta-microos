SUMMARY = "YaST2 - Easy Installation of Add-on RPMs using Metapackages"
DESCRIPTION = "With this technology users can install packages and add repositories \
with a simple click on a link in a website."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-metapackage-handler-4.6.0-1.1.noarch.rpm"
RPM_HASH = "ade23d7aac6c4dacfc29c960cabc41a79eb865127ac93be1116577624b2eed8e65f42794751227b78ebcf9d93f919e68bd3a61fdc4f408768d786c4f8dace707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-metapackage-handler"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xdg-su \
yast2 \
yast2-country-data \
yast2-packager \
yast2-ruby-bindings \
yast2-transfer"

inherit rpm
