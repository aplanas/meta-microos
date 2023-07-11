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

RPM_NAME = "python311-pickleshare-0.7.5-5.3.noarch.rpm"
RPM_HASH = "38f596a76add93d016bdf8c36cb92ebfdc998406617c4148c3ef575dcd61cc2fb9d6670d0d2c8eb4a5c27ec3692d9c31296c877d32d3ab4aa7268ee38b43f3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pickleshare \
python3.11dist-pickleshare \
python311-pickleshare \
python3dist-pickleshare"

RDEPENDS:${PN} += "python-abi"

inherit rpm
