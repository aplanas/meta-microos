SUMMARY = "Web-Hook server for pagure"
DESCRIPTION = "Pagure comes with an webhook server allowing http callbacks for any action \
done on a project. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-webhook-5.13.3-1.4.noarch.rpm"
RPM_HASH = "c5114f460163521603c21be743e9dfed43439c031c317de5934fc279cd0856b78cd427910c56e296554668bc9f7b7f65e3b6dc56c2798baf17cdd656a2f2cab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-webhook"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
