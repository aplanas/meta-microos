SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python311-amqpstorm-2.10.4-1.5.noarch.rpm"
RPM_HASH = "cd340dab91aa20827015f1d2ab7f3cae2cdbbb88de733e4e0170122af27099bbc880bcd6882f9c923533146c86da6ee53ee25307013190431603eff6ac7563f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-amqpstorm \
python311-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python311-pamqp \
python311-requests"

inherit rpm
