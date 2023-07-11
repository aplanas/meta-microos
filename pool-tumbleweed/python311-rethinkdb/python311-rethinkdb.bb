SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python311-rethinkdb-2.4.9-1.5.noarch.rpm"
RPM_HASH = "83a0e5eb6d914df27bbfe24bfc6002735a423c41875b96f0ab0055ca402dfe20657d73fd44c8c88c19a38d6c4b08cd4d9d21d4d1a6fc939e220a97817f5bfd82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rethinkdb \
python3.11dist-rethinkdb \
python311-rethinkdb \
python3dist-rethinkdb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
