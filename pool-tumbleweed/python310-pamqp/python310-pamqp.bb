SUMMARY = "Pure-python AMQP 0-9-1 frame encoder and decoder"
DESCRIPTION = "pamqp is a pure-python AMQP 0-9-1 frame encoder and decoder. \
 \
pamqp is not a end-user client library for talking to RabbitMQ but \
rather is used by client libraries for marshaling and unmarshaling \
AMQP frames. \
 \
AMQP class/method command class mappings can be found in the \
pamqp.specification module while actual frame encoding and \
encoding should be run through the pamqp.frame module."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "f4d02de65ae11c2738c9407a6ce6dc1ad14735f5811b8e8e321c04eda8fc115ff16c708f16166b36be2e20bc158b5afd3e1f7eaa837f3121677b05685d76b908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pamqp \
python310-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
