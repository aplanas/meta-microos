SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-pika-pool-0.1.3-5.14.noarch.rpm"
RPM_HASH = "31c074bb01a3f8cad0d6f0bfc897847adbb52111e404943d73ff0277da6c34a13645283484dfa9201b889202ca2844f07e854a5aa8e3ce4e7e9e4b91ca426b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pika-pool \
python39-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python39-pika"

inherit rpm
