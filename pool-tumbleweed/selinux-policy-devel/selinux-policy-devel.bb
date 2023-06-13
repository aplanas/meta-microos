SUMMARY = "SELinux policy devel"
DESCRIPTION = "SELinux policy development and man page package"
LICENSE = "GPL-2.0-or-later"

PV = "20230425"

RPM_NAME = "selinux-policy-devel-20230425-1.1.noarch.rpm"
RPM_HASH = "04df6df64fcad6b24c13e48081c6deecd95b6f63ffe0bde5e634b888c6963f9c27bac9e3cca079c86a695370db3b03e67d5cd6208a2297b3fd7a6301053abf2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-devel"

RDEPENDS:${PN} += "/usr/bin/make \
checkpolicy \
m4 \
selinux-policy"

inherit rpm
