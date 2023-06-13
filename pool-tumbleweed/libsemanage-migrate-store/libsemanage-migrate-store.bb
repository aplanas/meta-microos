SUMMARY = "SELinux Policy Store Migration"
DESCRIPTION = "In version 2.4 of libsemanage, libsepol, and policycoreutils, the policy \
module store was moved from /etc/selinux/<store>/modules/ to \
/var/lib/selinux/<store>/. Once the libraries are upgraded, all policy \
stores must be migrated before any commands that modify or use the store \
(e.g. semodule, semanage) can be executed."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-migrate-store-3.5-1.4.aarch64.rpm"
RPM_HASH = "9397964d9976cc53931160b220c66f70213a3f483f4fbb9245b8ff89ca4ab64d1ee678cb809ada5ca1a9a3c40fb0d77d0240590abcf5a9d4d7bd3ff557287fc9"

RPROVIDES:${PN} += "libsemanage-migrate-store \
libsemanage-migrate-store(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
