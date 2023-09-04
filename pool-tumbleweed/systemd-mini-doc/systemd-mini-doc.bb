SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-mini-doc-253.8-1.1.aarch64.rpm"
RPM_HASH = "367b4aca816da9062efe61d72547fdf3b8283beaa1cb131bc2b4b2835ad204734f228d6149923f58e3f300f547a558c77660b16cfe62439ed3d13ab0d89894b9"

RPROVIDES:${PN} += "systemd-mini-doc"

RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
