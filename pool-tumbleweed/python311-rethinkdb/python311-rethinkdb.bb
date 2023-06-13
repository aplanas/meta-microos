SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python311-rethinkdb-2.4.9-1.4.noarch.rpm"
RPM_HASH = "32ae71ddd3a945b00d403183c8f7afaf98b9721e46f38079fb760452080090f0e76866eabf06761db633f5f94fa3e512383af60c6cda104deb39968bd169c060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rethinkdb) \
python311-rethinkdb \
python3dist(rethinkdb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-six \
update-alternatives"

inherit rpm
