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

RPM_NAME = "python310-impacket-0.10.0-1.1.noarch.rpm"
RPM_HASH = "f590f62416536707c9387b86e7324f92ecd61ac47bff9c3d8585abc42ff6d17862d2aea73277eb68f21c4cd1dd84b93d0a27d4ef84235653f6fe5040b1f6fcb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-impacket \
python3.10dist(impacket) \
python310-impacket \
python3dist(impacket)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
