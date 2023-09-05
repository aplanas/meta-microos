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

RPM_NAME = "python39-impacket-0.11.0-1.1.noarch.rpm"
RPM_HASH = "fba14f798fc294a184cceac967fb3c24739366866271767a15d1eaa1fd53eedb8c1aea374b585099f7d773222781dc6400322c9d83068d756ccac7d8d22e41ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-impacket \
python39-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Flask \
python39-charset-normalizer \
python39-future \
python39-ldap3 \
python39-ldapdomaindump \
python39-pyOpenSSL \
python39-pyasn1 \
python39-pycryptodomex \
python39-six \
update-alternatives"

inherit rpm
