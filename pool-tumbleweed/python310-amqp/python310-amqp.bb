SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.1"

RPM_NAME = "python310-amqp-5.1.1-2.3.noarch.rpm"
RPM_HASH = "47ae0a364541929729cfbb19328307e2dfd25adf8877edbcfb720dbb5a79b5b7fa06b54ae7605594f5cc52105401160b8b5726b5870f1c6516cb82f6000d945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-amqp \
python310-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python310-vine"

inherit rpm
