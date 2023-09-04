SUMMARY = "Perl extension for the DBus message system"
DESCRIPTION = "Net::DBus provides a Perl API for the DBus message system. The DBus Perl \
interface is currently operating against the 0.32 development version of \
DBus, but should work with later versions too, providing the API changes \
have not been too drastic. \
 \
Users of this package are either typically, service providers in which case \
the Net::DBus::Service and Net::DBus::Object modules are of most relevance, \
or are client consumers, in which case Net::DBus::RemoteService and \
Net::DBus::RemoteObject are of most relevance."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "perl-Net-DBus-1.2.0-1.19.aarch64.rpm"
RPM_HASH = "dc4ea13c6c27fcfffe7713b5b9e71ba1c87d303f25460f3695c7e332063727c927f15fd370cd53fafeef695c6152b20ad35441968836805da16ee5aac1825fe5"

RPROVIDES:${PN} += "perl-Net--DBus \
perl-Net--DBus--ASyncReply \
perl-Net--DBus--Annotation \
perl-Net--DBus--BaseObject \
perl-Net--DBus--Binding--Bus \
perl-Net--DBus--Binding--Connection \
perl-Net--DBus--Binding--Introspector \
perl-Net--DBus--Binding--Iterator \
perl-Net--DBus--Binding--Message \
perl-Net--DBus--Binding--Message--Error \
perl-Net--DBus--Binding--Message--MethodCall \
perl-Net--DBus--Binding--Message--MethodReturn \
perl-Net--DBus--Binding--Message--Signal \
perl-Net--DBus--Binding--PendingCall \
perl-Net--DBus--Binding--Server \
perl-Net--DBus--Binding--Value \
perl-Net--DBus--Binding--Watch \
perl-Net--DBus--Callback \
perl-Net--DBus--Dumper \
perl-Net--DBus--Error \
perl-Net--DBus--Exporter \
perl-Net--DBus--Object \
perl-Net--DBus--ProxyObject \
perl-Net--DBus--Reactor \
perl-Net--DBus--RemoteObject \
perl-Net--DBus--RemoteService \
perl-Net--DBus--Service \
perl-Net--DBus--Test--MockConnection \
perl-Net--DBus--Test--MockIterator \
perl-Net--DBus--Test--MockMessage \
perl-Net--DBus--Test--MockObject \
perl-Net-DBus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
perl--MODULE-COMPAT-5.38.0 \
perl-XML--Twig"

inherit rpm
