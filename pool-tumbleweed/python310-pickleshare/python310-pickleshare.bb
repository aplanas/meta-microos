SUMMARY = "Tiny shelve-like database with concurrency support"
DESCRIPTION = "PickleShare - a small 'shelve' like datastore with concurrency support \
 \
Like shelve, a PickleShareDB object acts like a normal dictionary. Unlike shelve, \
many processes can access the database simultaneously. Changing a value in \
database is immediately visible to other processes accessing the same database. \
 \
Concurrency is possible because the values are stored in separate files. Hence \
the 'database' is a directory where *all* files are governed by PickleShare. \
 \
This module is certainly not ZODB, but can be used for low-load \
(non-mission-critical) situations where tiny code size trumps the \
advanced features of a 'real' object database. \
 \
Installation guide: pip install path pickleshare"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python310-pickleshare-0.7.5-5.3.noarch.rpm"
RPM_HASH = "debd12f9cb84051b26c6e261209f143b9eefe372e06f27f1f94ff2e7d33cc507e98ae1a871c29bc93de6844483e86e840e26799d16552465374d005d72a58ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pickleshare \
python310-pickleshare \
python3dist-pickleshare"

RDEPENDS:${PN} += "python-abi"

inherit rpm
