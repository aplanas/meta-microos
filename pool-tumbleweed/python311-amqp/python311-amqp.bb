SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python311-amqp-5.1.1-2.3.noarch.rpm"
RPM_HASH = "b5b7e85325f63666894375b79578fbf738561ceae7e33a593f2c51642fac77af2aaf803c1b641ff80a2d3de567845bbbe88b5487e00aebc7d731e79d5b79eb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqp \
python3.11dist-amqp \
python311-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python311-vine"

inherit rpm
