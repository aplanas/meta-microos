SUMMARY = "Mojo::IOLoop based RabbitMQ client"
DESCRIPTION = "Mojo::RabbitMQ::Client is a rewrite of AnyEvent::RabbitMQ to work on top of \
Mojo::IOLoop."
LICENSE = "Artistic-2.0"

PV = "0.3.1"

RPM_NAME = "perl-Mojo-RabbitMQ-Client-0.3.1-1.17.noarch.rpm"
RPM_HASH = "3159b649bf5180f195a6b47ddf5c83d03a7f2dd3c5c81b39213acf70c726b585bfea1ca38129211e51042f9f9841345db5e91c0a7df42ed11923880a0b534348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--RabbitMQ--Client \
perl-Mojo--RabbitMQ--Client--Channel \
perl-Mojo--RabbitMQ--Client--Consumer \
perl-Mojo--RabbitMQ--Client--LocalQueue \
perl-Mojo--RabbitMQ--Client--Method \
perl-Mojo--RabbitMQ--Client--Method--Publish \
perl-Mojo--RabbitMQ--Client--Publisher \
perl-Mojo-RabbitMQ-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir \
perl-List--Util \
perl-Mojolicious \
perl-Net--AMQP"

inherit rpm
