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

RPM_NAME = "perl-Net-AMQP-RabbitMQ-2.40010-1.5.aarch64.rpm"
RPM_HASH = "a6dcaa96fb8a21f75c54a2d39629f8177f9f1fb0f7fa9223dde3749af702c21a43b0ba082ace0ba3a035043d2324cfdaa88d9a348abe6f662bfa10b731e58abd"

RPROVIDES:${PN} += "perl-Net--AMQP--RabbitMQ \
perl-Net-AMQP-RabbitMQ"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.38.0 \
perl-Math--Int64"

inherit rpm
