SUMMARY = "Perl bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Perl bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-perl-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "c5ef3448db380ca68e6cbe3bd76dc459f02feb776dbc434be917a54fff868b1105374772e6aad9dfaa8accef9ffb374657d84c0bb0bbcc7cefadeb1621ee4d27"

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
