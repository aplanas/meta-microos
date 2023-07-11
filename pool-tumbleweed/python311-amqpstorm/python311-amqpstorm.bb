SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python311-amqpstorm-2.10.4-1.7.noarch.rpm"
RPM_HASH = "5bcba99d20e8b44cb365e25162a847de600ac21baca527fd25fc31f16d104eb1b02818d35a44a0cf8fc3d5e11f272f83949a3bed665a6b9a040e68f00d675d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqpstorm \
python3.11dist-amqpstorm \
python311-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python311-pamqp \
python311-requests"

inherit rpm
