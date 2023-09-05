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

PV = "0.11.0"

RPM_NAME = "python310-impacket-0.11.0-1.1.noarch.rpm"
RPM_HASH = "847141b010947fb36fb85f1661a1a60e5a74689771f8ae588096a634b61d5c72f7065e3ac17f9cea262a9be26a0b5ad72a52f2c292c197fa67f67984c7a32513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-impacket \
python310-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Flask \
python310-charset-normalizer \
python310-future \
python310-ldap3 \
python310-ldapdomaindump \
python310-pyOpenSSL \
python310-pyasn1 \
python310-pycryptodomex \
python310-six \
update-alternatives"

inherit rpm
