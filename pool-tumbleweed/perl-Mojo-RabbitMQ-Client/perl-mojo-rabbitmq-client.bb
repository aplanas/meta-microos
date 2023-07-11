SUMMARY = "Mojo::IOLoop based RabbitMQ client"
DESCRIPTION = "Mojo::RabbitMQ::Client is a rewrite of AnyEvent::RabbitMQ to work on top of \
Mojo::IOLoop."
LICENSE = "Artistic-2.0"

PV = "0.3.1"

RPM_NAME = "perl-Mojo-RabbitMQ-Client-0.3.1-1.16.noarch.rpm"
RPM_HASH = "8b9d2c4922296fbb7ed02fca277b7e20d91241cacd259a685550794dad246db28a3b1628f72050708d943e4321d06fa282c9d20b409e9376b8bcd8d2f62214bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--RabbitMQ--Client \
perl-Mojo--RabbitMQ--Client--Channel \
perl-Mojo--RabbitMQ--Client--Consumer \
perl-Mojo--RabbitMQ--Client--LocalQueue \
perl-Mojo--RabbitMQ--Client--Method \
perl-Mojo--RabbitMQ--Client--Method--Publish \
perl-Mojo--RabbitMQ--Client--Publisher \
perl-Mojo-RabbitMQ-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir \
perl-List--Util \
perl-Mojolicious \
perl-Net--AMQP"

inherit rpm
