SUMMARY = "Interact with RabbitMQ over AMQP using librabbitmq"
DESCRIPTION = "'Net::AMQP::RabbitMQ' provides a simple wrapper around the librabbitmq \
library that allows connecting, declaring exchanges and queues, binding and \
unbinding queues, publishing, consuming and receiving events. \
 \
Error handling in this module is primarily achieve by 'Perl_croak' (die). \
You should be making good use of 'eval' around these methods to ensure that \
you appropriately catch the errors."
LICENSE = "MPL-1.1"

PV = "2.40010"

RPM_NAME = "perl-Net-AMQP-RabbitMQ-2.40010-1.4.aarch64.rpm"
RPM_HASH = "4d3f78f4588576b6487fa716fa8f0b74cbd4b1906b2290bebb61daeae63fb9d887f83569572e660b3681992ad5f474e564864e8c248a958afe1f4d10788672e0"

RPROVIDES:${PN} += "perl-Net--AMQP--RabbitMQ \
perl-Net-AMQP-RabbitMQ"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.36.1 \
perl-Math--Int64"

inherit rpm
