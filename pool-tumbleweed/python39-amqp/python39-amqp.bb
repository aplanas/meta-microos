SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python39-amqp-5.1.1-2.3.noarch.rpm"
RPM_HASH = "982c688bc93d0739f27eb29412c86a9f90348ccca952cd1eb25743c6831d4ea00929dbe2879c65004e0b9d8e7b9707d5d86bca988f49358b98e2a9c29409edef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-amqp \
python39-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python39-vine"

inherit rpm
