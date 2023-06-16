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

RPM_NAME = "python311-impacket-0.10.0-1.1.noarch.rpm"
RPM_HASH = "79033266547e8c171dba31f34fcd150b01a2724350e00ef58fca0b761ff820324b21cbd4aa5f90fc98474bda0e2f32543f28f2d5fb6e13023571b1099ca5bdb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-impacket \
python311-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-chardet \
python311-future \
python311-ldap3 \
python311-ldapdomaindump \
python311-pyOpenSSL \
python311-pyasn1 \
python311-pycryptodomex \
python311-six \
update-alternatives"

inherit rpm
