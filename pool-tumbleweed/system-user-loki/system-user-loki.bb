SUMMARY = "System user and group 'loki'"
DESCRIPTION = "This package provides a shared system user for all Loki components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-loki-1.0.0-1.8.noarch.rpm"
RPM_HASH = "fa52e1fb3bdc42bfaf0853f2483273a86e034644b073d93b24f28a6ec40569df08398bd393bd02e67bd4458d405cb18808361652bcf1234c3fe0b9caff90895f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-loki \
system-user-loki \
user-loki"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
