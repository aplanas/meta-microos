SUMMARY = "SELinux Policy Store Migration"
DESCRIPTION = "In version 2.4 of libsemanage, libsepol, and policycoreutils, the policy \
module store was moved from /etc/selinux/<store>/modules/ to \
/var/lib/selinux/<store>/. Once the libraries are upgraded, all policy \
stores must be migrated before any commands that modify or use the store \
(e.g. semodule, semanage) can be executed."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-migrate-store-3.5-1.9.aarch64.rpm"
RPM_HASH = "072b8eff1b0d51d6cb91c44c496a475029e0c61fabed7a7e1b198badabb0f5ebacb9ca6d24b0385001bfe0d434afcc007d2fc6c65d3038e2565a275580f7aac4"

RPROVIDES:${PN} += "libsemanage-migrate-store"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
