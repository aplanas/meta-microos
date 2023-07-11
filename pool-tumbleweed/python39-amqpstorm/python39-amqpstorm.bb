SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python39-amqpstorm-2.10.4-1.7.noarch.rpm"
RPM_HASH = "7761f9eab62958ded9281c8804c52594ccad8486b109b2db5a0d39a845090a94fdeb221c1ede4fb24e0512f84741495fd68a0f5389658b87e9701077a7c9c8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-amqpstorm \
python39-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python39-pamqp \
python39-requests"

inherit rpm
