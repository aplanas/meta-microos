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

RPM_NAME = "python311-impacket-0.11.0-1.1.noarch.rpm"
RPM_HASH = "88919420688234798ed21e1778512d892ca21653d86a91d2359f02e3c1630a3fa90d8dfcb80921a3b8e0ce6977ad9944c3d6097b95f08f349072361d1753f398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-impacket \
python3.11dist-impacket \
python311-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-charset-normalizer \
python311-future \
python311-ldap3 \
python311-ldapdomaindump \
python311-pyOpenSSL \
python311-pyasn1 \
python311-pycryptodomex \
python311-six \
update-alternatives"

inherit rpm
