SUMMARY = "Mojo::IOLoop based RabbitMQ client"
DESCRIPTION = "Mojo::RabbitMQ::Client is a rewrite of AnyEvent::RabbitMQ to work on top of \
Mojo::IOLoop."
LICENSE = "Artistic-2.0"

PV = "0.3.1"

RPM_NAME = "perl-Mojo-RabbitMQ-Client-0.3.1-1.15.noarch.rpm"
RPM_HASH = "a0b2ad24aee38d906b15cccbdddc490a6ff20e3813b4c7a3244b2f5b053af15fbfd5685578aa552f6960e32ca9cf33b76f1791e1fa1de08619139b951e9c8b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::RabbitMQ::Client) \
perl(Mojo::RabbitMQ::Client::Channel) \
perl(Mojo::RabbitMQ::Client::Consumer) \
perl(Mojo::RabbitMQ::Client::LocalQueue) \
perl(Mojo::RabbitMQ::Client::Method) \
perl(Mojo::RabbitMQ::Client::Method::Publish) \
perl(Mojo::RabbitMQ::Client::Publisher) \
perl-Mojo-RabbitMQ-Client"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir) \
perl(List::Util) \
perl(Mojolicious) \
perl(Net::AMQP)"

inherit rpm
