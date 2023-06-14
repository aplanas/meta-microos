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

RPM_NAME = "python310-ldappool-3.0.0-3.3.noarch.rpm"
RPM_HASH = "295ee889e329978ff50461020fda298ed7cc697f7c8d1f9f5217ab2805096eb65c539c36cad9476c50e395c95449488d157c6257db9a52b622ccd332ef9fcf3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldappool \
python3.10dist-ldappool \
python310-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python310-ldap \
python310-prettytable"

inherit rpm
