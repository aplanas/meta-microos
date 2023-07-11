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

RPM_NAME = "python311-ldappool-3.0.0-3.4.noarch.rpm"
RPM_HASH = "08fb2c1f7110be3d2ce471d33d24ee96353602546c135b3299f5da1a10c921e137bf28ba7522409052bb9924a4f735408b5cf4213e82f8347f1724f46d5f7c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldappool \
python3.11dist-ldappool \
python311-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python311-ldap \
python311-prettytable"

inherit rpm
