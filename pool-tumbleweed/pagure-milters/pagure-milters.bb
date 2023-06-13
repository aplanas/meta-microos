SUMMARY = "Milter to integrate pagure with emails"
DESCRIPTION = "Milters (Mail filters) allowing the integration of pagure and emails. \
This is useful for example to allow commenting on a ticket by email."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-milters-5.13.3-1.4.noarch.rpm"
RPM_HASH = "843f37fd858466f310734d652c6de491b43cf5d005a409390ecaada3ff018734149b2c7dd9ea0c040a7df7256a69f78bbe08cba0755bf8335242895ac28ae026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-milters"

RDEPENDS:${PN} += "/bin/sh \
pagure \
postfix \
python3-pymilter \
systemd"

inherit rpm
