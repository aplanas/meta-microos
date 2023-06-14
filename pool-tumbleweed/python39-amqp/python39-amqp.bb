SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python39-amqp-5.1.1-1.5.noarch.rpm"
RPM_HASH = "27c13ebd7261a8f9ecc2c2304ffc692c0bb3620b24159a43c687409c4003f66f2424739acc2775b79cb2edefb1d4e884afc3a11327c9cad1f5c819dae824cbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-amqp \
python39-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python39-vine"

inherit rpm
