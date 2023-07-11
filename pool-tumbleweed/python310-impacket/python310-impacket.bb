SUMMARY = "Python3 module to easily build and dissect network protocols"
DESCRIPTION = "Impacket is a collection of Python classes for working with network \
protocols. Impacket is focused on providing low-level \
programmatic access to the packets and for some protocols (e.g. \
SMB1-3 and MSRPC) the protocol implementation itself. \
Packets can be constructed from scratch, as well as parsed from \
raw data, and the object oriented API makes it simple to work with \
deep hierarchies of protocols. The library provides a set of tools \
as examples of what can be done within the context of this library."
LICENSE = "Apache-1.1"

PV = "0.10.0"

RPM_NAME = "python310-impacket-0.10.0-1.3.noarch.rpm"
RPM_HASH = "1870ba38e592fd091ce2ab3c5ecf8da9da06fb2b9aa417f9089688a76906aaef6ffaee2bd3548eb8298005467c72851d798f65f6ce333b2a01efb7efc9c0af8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-impacket \
python310-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Flask \
python310-chardet \
python310-future \
python310-ldap3 \
python310-ldapdomaindump \
python310-pyOpenSSL \
python310-pyasn1 \
python310-pycryptodomex \
python310-six \
update-alternatives"

inherit rpm
