SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-pika-pool-0.1.3-5.14.noarch.rpm"
RPM_HASH = "e3d9acd1fb9bb2b6f3184c1abbbcf50eba5a50b54e8a0d152b7c6c401ddc7ae6343dd44207a6c4caa54af4d6ca906374d404bf4e7744019d41a8bf9e30b255d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika-pool \
python3.11dist-pika-pool \
python311-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python311-pika"

inherit rpm
