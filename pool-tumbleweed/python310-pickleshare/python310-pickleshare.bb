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

RPM_NAME = "python310-pickleshare-0.7.5-5.1.noarch.rpm"
RPM_HASH = "60fa5491da983d91dad06571f123a3be9468329ae6b3fdb16e113c285c6ed005523b79e501ba2e17cd568d9ba88995aacd8058d291c4f6828a37900669cfddd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pickleshare \
python3.10dist(pickleshare) \
python310-pickleshare \
python3dist(pickleshare)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
