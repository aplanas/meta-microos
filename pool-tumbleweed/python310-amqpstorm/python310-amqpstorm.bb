SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python310-amqpstorm-2.10.4-1.7.noarch.rpm"
RPM_HASH = "9da17d379c985b36190830041908103e82d36590bd74d35ed5ca1f8c4958693d31b6798825b25c3b547d9454b613be8349b982b86893e3d7ff6088912939ef69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-amqpstorm \
python310-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python310-pamqp \
python310-requests"

inherit rpm
