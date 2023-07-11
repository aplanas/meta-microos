SUMMARY = "Milter to integrate pagure with emails"
DESCRIPTION = "Milters (Mail filters) allowing the integration of pagure and emails. \
This is useful for example to allow commenting on a ticket by email."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-milters-5.13.3-1.5.noarch.rpm"
RPM_HASH = "e64854c94dfda8166fc1ae5ce40c868c4ed994223aa031b6e0a646b0ee781ce8c1ef49825b7f9256de8358f1cfe352a507da6d57e7604983ad684c358daa3b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-milters"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
postfix \
python3-pymilter \
systemd"

inherit rpm
