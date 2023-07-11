SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-pika-pool-0.1.3-5.14.noarch.rpm"
RPM_HASH = "69fd639464b18f3d6f41d6d25212e051db1067dd4e5aa0ea821abd440bb8e2a23585854cf14cbb928ee9b7a1c07ad7c8976a9f551c86138fe193a916243486f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pika-pool \
python310-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python310-pika"

inherit rpm
