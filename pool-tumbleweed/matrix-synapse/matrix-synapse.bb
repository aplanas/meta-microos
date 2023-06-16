SUMMARY = "Matrix protocol reference homeserver"
DESCRIPTION = "Synapse is a Python-based reference 'homeserver' implementation of \
Matrix. Matrix is a system for federated Instant Messaging and VoIP."
LICENSE = "Apache-2.0"

PV = "1.77.0"

RPM_NAME = "matrix-synapse-1.77.0-2.13.aarch64.rpm"
RPM_HASH = "a1fc3266c384b542dcf6b3644934c1c9bedf193055e0194b9803f3effca9367b2b84a4a15ca5f36d09c3e6883a4f3fccd2653fcf2f3a1d1901be4836b1630301"

RPROVIDES:${PN} += "config-matrix-synapse \
group-synapse \
matrix-synapse \
python2-matrix-synapse \
python3.10dist-matrix-synapse \
python310-matrix-synapse \
python3dist-matrix-synapse \
user-synapse"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python310-Authlib \
python310-Jinja2 \
python310-Pillow \
python310-PyICU \
python310-PyYAML \
python310-Pympler \
python310-Twisted \
python310-attrs \
python310-base \
python310-bcrypt \
python310-bleach \
python310-canonicaljson \
python310-cryptography \
python310-frozendict \
python310-idna \
python310-ijson \
python310-jsonschema \
python310-lxml \
python310-matrix-common \
python310-msgpack \
python310-netaddr \
python310-packaging \
python310-phonenumbers \
python310-prometheus-client \
python310-psutil \
python310-psycopg2 \
python310-pyOpenSSL \
python310-pyasn1 \
python310-pyasn1-modules \
python310-pydantic \
python310-pymacaroons \
python310-pysaml2 \
python310-service-identity \
python310-signedjson \
python310-sortedcontainers \
python310-systemd \
python310-treq \
python310-typing-extensions \
python310-unpaddedbase64 \
sysuser-shadow"

inherit rpm
