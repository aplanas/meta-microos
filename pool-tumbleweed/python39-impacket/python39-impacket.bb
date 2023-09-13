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

RPM_NAME = "python39-impacket-0.11.0-2.1.noarch.rpm"
RPM_HASH = "f06b0e05b1f7936690d2934180711d56aa91ab425717995d5c2bc2c38746ddbbfc2f7c96d21d4429fec54309c408e980c85d5bbf9ef512088973e6cb0d62ed30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-impacket \
python39-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Flask \
python39-charset-normalizer \
python39-ldap3 \
python39-ldapdomaindump \
python39-pyOpenSSL \
python39-pyasn1 \
python39-pycryptodomex \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
