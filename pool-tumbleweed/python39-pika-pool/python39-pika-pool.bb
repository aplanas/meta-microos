SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-pika-pool-0.1.3-5.12.noarch.rpm"
RPM_HASH = "ff1c676951305ddf7db02ecfed1b29bb37195123f85d3cf48f8211d74b7f31ac4c97098bf068be9135d719923a3e10320c2e032b7b14e46b30a219c684a051a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pika-pool \
python39-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python39-pika"

inherit rpm
