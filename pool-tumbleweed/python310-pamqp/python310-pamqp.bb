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

RPM_NAME = "python310-pamqp-3.2.1-1.3.noarch.rpm"
RPM_HASH = "da97e88f3b5602927c287ced36b3f6d009a5d861183060a7b74effb6bf2b3dbe59127bad021b27f45ad61a69d21aa6ba78b5bac4882329ee75ceb339e2aa1701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamqp \
python3.10dist(pamqp) \
python310-pamqp \
python3dist(pamqp)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
