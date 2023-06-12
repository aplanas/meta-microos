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

RPM_NAME = "python311-pickleshare-0.7.5-5.1.noarch.rpm"
RPM_HASH = "489f4da759211ca2d7e559137bbdffff0726b53b473948075045f7233c75c59e72148c10165c71a74b77a885a433eada9d579da18f01b15dd2d9cc3e77ba59e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pickleshare) \
python311-pickleshare \
python3dist(pickleshare)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
