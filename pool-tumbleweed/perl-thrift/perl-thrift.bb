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

RPM_NAME = "perl-thrift-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "170a2356d3ec2721bc393a191e61c3bd7057da62d181f687cb7efc700cc8cd9b1f0e09ed0c9833b603de817b9986d99022cd203f2bff17d98472a7be0ee89a6b"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
