SUMMARY = "Advanced Message Queue Protocol (de)serialization and representation"
DESCRIPTION = "This module implements the frame (de)serialization and representation of \
the Advanced Message Queue Protocol (http://www.amqp.org/). It is to be \
used in conjunction with client or server software that does the actual \
TCP/IP communication."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Net-AMQP-0.06-1.20.noarch.rpm"
RPM_HASH = "ac880f3d72b93a886bf375d5fcdac1bfef4f49f26b94e077dee866b1e7cc91caee825523819b15cc537679d56576dcaaefcf414be52c21b0fc9ffb5b14d653d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::AMQP) \
perl(Net::AMQP::Common) \
perl(Net::AMQP::Frame) \
perl(Net::AMQP::Frame::Body) \
perl(Net::AMQP::Frame::Header) \
perl(Net::AMQP::Frame::Heartbeat) \
perl(Net::AMQP::Frame::Method) \
perl(Net::AMQP::Frame::OOBBody) \
perl(Net::AMQP::Frame::OOBHeader) \
perl(Net::AMQP::Frame::OOBMethod) \
perl(Net::AMQP::Frame::Trace) \
perl(Net::AMQP::Protocol) \
perl(Net::AMQP::Protocol::Base) \
perl(Net::AMQP::Protocol::v0_8) \
perl(Net::AMQP::Value) \
perl(Net::AMQP::Value::Boolean) \
perl(Net::AMQP::Value::Integer) \
perl(Net::AMQP::Value::String) \
perl(Net::AMQP::Value::Timestamp) \
perl-Net-AMQP"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor) \
perl(Class::Data::Inheritable) \
perl(XML::LibXML)"

inherit rpm
