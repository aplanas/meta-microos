SUMMARY = "Web-Hook server for pagure"
DESCRIPTION = "Pagure comes with an webhook server allowing http callbacks for any action \
done on a project. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-webhook-5.13.3-1.5.noarch.rpm"
RPM_HASH = "f6602229e1e616948377c70611b50b4063f7f451131ee0614c423367d81e7a9e8aa8aee0a8b76e13c53de89d150aab62cd0d63fcd90040524e7713f7128bf1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-webhook"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
