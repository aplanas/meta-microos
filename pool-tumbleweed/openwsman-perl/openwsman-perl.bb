SUMMARY = "Perl bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Perl bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-perl-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "3c4b65eca18565d68650681182404167f1ad978a1dad8b83c1cdfe66f3869cad1a0c7962024d79efe4bb5af7613331c31e44bcc53691c55be8db7086f6ab04b6"

RPROVIDES:${PN} += "openwsman-perl \
perl-openwsman \
perl-openwsman--Client \
perl-openwsman--ClientOptions \
perl-openwsman--Context \
perl-openwsman--EndPointReference \
perl-openwsman--EnumerateInfo \
perl-openwsman--Fault \
perl-openwsman--Filter \
perl-openwsman--Soap \
perl-openwsman--SoapOp \
perl-openwsman--Status \
perl-openwsman--Transport \
perl-openwsman--XmlAttr \
perl-openwsman--XmlDoc \
perl-openwsman--XmlNode \
perl-openwsman--XmlNs \
perl-openwsmanc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
perl"

inherit rpm
