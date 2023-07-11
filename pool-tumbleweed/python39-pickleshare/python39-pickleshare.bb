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

RPM_NAME = "python39-pickleshare-0.7.5-5.3.noarch.rpm"
RPM_HASH = "5d57dc7cc0eb5cc2d141742dd65638df15a6b4cf670fba49920ef515f391944957619c25ff12aa732959a6678705238e9adc3c12044175d910e35b6b26d913a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pickleshare \
python39-pickleshare \
python3dist-pickleshare"

RDEPENDS:${PN} += "python-abi"

inherit rpm
