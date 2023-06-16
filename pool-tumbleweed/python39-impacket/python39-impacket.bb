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

RPM_NAME = "python39-impacket-0.10.0-1.1.noarch.rpm"
RPM_HASH = "f4182cafea1828fb14e453178f397d50d330d4c1c2c8b8d407f476f01c48dcdd6f7d1fedab84a65a04a2b2311561c6a44b162aaa8c5fd2b9b00f94e7c0db8676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-impacket \
python39-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Flask \
python39-chardet \
python39-future \
python39-ldap3 \
python39-ldapdomaindump \
python39-pyOpenSSL \
python39-pyasn1 \
python39-pycryptodomex \
python39-six \
update-alternatives"

inherit rpm
