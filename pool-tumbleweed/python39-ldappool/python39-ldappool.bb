SUMMARY = "A connection pool for python-ldap"
DESCRIPTION = "A simple connector pool for python-ldap. \
 \
The pool keeps LDAP connectors alive and let you reuse them, \
drastically reducing the time spent to initiate a ldap connection. \
 \
The pool has useful features like: \
 \
- transparent reconnection on failures or server restarts \
- configurable pool size and connectors timeouts \
- configurable max lifetime for connectors \
- a context manager to simplify acquiring and releasing a connector"
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python39-ldappool-3.0.0-3.4.noarch.rpm"
RPM_HASH = "45fe2b83413eb71e18859b62f297f3770be526209064838a887b2db7179475470a2557918c1a2b81762c3e6e2d2bfb83883278997f796e62028f059c69828c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldappool \
python39-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python39-ldap \
python39-prettytable"

inherit rpm
