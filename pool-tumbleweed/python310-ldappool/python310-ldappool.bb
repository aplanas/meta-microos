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

RPM_NAME = "python310-ldappool-3.0.0-3.4.noarch.rpm"
RPM_HASH = "5a3045ae160d4721b6035aea4f5b1b08fab64e6480b0322d425075e3099b2b7140a181bbabc10dee71de51c879d92b60b92ca7e96bf20eac6b4eaeff2f383685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ldappool \
python310-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python310-ldap \
python310-prettytable"

inherit rpm
