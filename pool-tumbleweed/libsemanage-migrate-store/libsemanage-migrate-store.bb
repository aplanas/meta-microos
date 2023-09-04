SUMMARY = "SELinux Policy Store Migration"
DESCRIPTION = "In version 2.4 of libsemanage, libsepol, and policycoreutils, the policy \
module store was moved from /etc/selinux/<store>/modules/ to \
/var/lib/selinux/<store>/. Once the libraries are upgraded, all policy \
stores must be migrated before any commands that modify or use the store \
(e.g. semodule, semanage) can be executed."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-migrate-store-3.5-2.1.aarch64.rpm"
RPM_HASH = "42a40577e4680497f1bb74d3f0a6ede176678bf717e855ee222b4227c9fe9a4ecea139f52f9e05ff574e4849f7c840c6a35a3e6bc8b469920b5be2cdf6306edd"

RPROVIDES:${PN} += "libsemanage-migrate-store"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
