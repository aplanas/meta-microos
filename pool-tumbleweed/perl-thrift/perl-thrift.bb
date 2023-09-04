SUMMARY = "Perl bindings to the Thrift software framework"
DESCRIPTION = "Thrift Perl library \
 \
Thrift is a software framework for scalable cross-language services \
development. It combines a software stack with a code generation \
engine to build services that work between C++, Java, C#, Python, \
Ruby, Perl, PHP, Objective C/Cocoa, Smalltalk, Erlang, Objective \
Caml, and Haskell."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "perl-thrift-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "dc130140d9ba7f842931701bc6be4207e17925e57feeeb43958244f6b21217dc05a86c69ee33a795a73394671ce5cd035cb3a87232c64db68c77f375ef2fa645"

RPROVIDES:${PN} += "perl-Thrift \
perl-Thrift--BinaryProtocol \
perl-Thrift--BinaryProtocolFactory \
perl-Thrift--BufferedTransport \
perl-Thrift--BufferedTransportFactory \
perl-Thrift--ForkingServer \
perl-Thrift--FramedTransport \
perl-Thrift--FramedTransportFactory \
perl-Thrift--HttpClient \
perl-Thrift--MemoryBuffer \
perl-Thrift--MultiplexedProcessor \
perl-Thrift--MultiplexedProtocol \
perl-Thrift--Protocol \
perl-Thrift--ProtocolDecorator \
perl-Thrift--SSLServerSocket \
perl-Thrift--SSLSocket \
perl-Thrift--Server \
perl-Thrift--ServerSocket \
perl-Thrift--ServerTransport \
perl-Thrift--SimpleServer \
perl-Thrift--Socket \
perl-Thrift--StoredMessageProtocol \
perl-Thrift--TApplicationException \
perl-Thrift--TException \
perl-Thrift--TMessageType \
perl-Thrift--TProtocolException \
perl-Thrift--TProtocolFactory \
perl-Thrift--TTransportException \
perl-Thrift--TType \
perl-Thrift--Transport \
perl-Thrift--TransportFactory \
perl-Thrift--UnixServerSocket \
perl-Thrift--UnixSocket \
perl-thrift"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
