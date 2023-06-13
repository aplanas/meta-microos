SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-pika-pool-0.1.3-5.12.noarch.rpm"
RPM_HASH = "2f529905a7b384a6cc7b01a2fb6f68ddfb7e110c484f833154b3492dc6d6cc6aa8827c60d3731a29e7cfa26225d7276cce57041971ed34c4a4411e5a47f88faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika-pool \
python3.10dist(pika-pool) \
python310-pika-pool \
python3dist(pika-pool)"

RDEPENDS:${PN} += "python(abi) \
python310-pika"

inherit rpm
