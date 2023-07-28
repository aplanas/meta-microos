SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-mini-doc-253.7-1.1.aarch64.rpm"
RPM_HASH = "899ce500966375297c571c1cc462c0d7fa227f0c5032c7d415f8d88cfae3d85e190ddb3af6ce9d2b57e74aea6c1308f5fc4b9448be8decabaa34794045bdce28"

RPROVIDES:${PN} += "systemd-mini-doc"

RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
