SUMMARY = "Matrix protocol reference homeserver"
DESCRIPTION = "Synapse is a Python-based reference 'homeserver' implementation of \
Matrix. Matrix is a system for federated Instant Messaging and VoIP."
LICENSE = "Apache-2.0"

PV = "1.91.2"

RPM_NAME = "matrix-synapse-1.91.2-1.2.aarch64.rpm"
RPM_HASH = "db4f17e0e7adf275906d293e18ded33e04c6617c07d3d820b1da3bb4ee422515653520859fed73b9f47dc5a296c6420702e10e1a326ee519c00e46ada3f82f19"

RPROVIDES:${PN} += "config-matrix-synapse \
group-synapse \
matrix-synapse \
python2-matrix-synapse \
python3-matrix-synapse \
python3.11dist-matrix-synapse \
python3dist-matrix-synapse \
user-synapse"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python311-Authlib \
python311-Jinja2 \
python311-Pillow \
python311-PyICU \
python311-PyYAML \
python311-Pympler \
python311-Twisted \
python311-attrs \
python311-base \
python311-bcrypt \
python311-bleach \
python311-canonicaljson \
python311-cryptography \
python311-idna \
python311-ijson \
python311-immutabledict \
python311-jsonschema \
python311-lxml \
python311-matrix-common \
python311-msgpack \
python311-netaddr \
python311-packaging \
python311-phonenumbers \
python311-prometheus-client \
python311-psutil \
python311-psycopg2 \
python311-pyOpenSSL \
python311-pyasn1 \
python311-pyasn1-modules \
python311-pydantic \
python311-pymacaroons \
python311-pysaml2 \
python311-service-identity \
python311-signedjson \
python311-sortedcontainers \
python311-systemd \
python311-treq \
python311-typing-extensions \
python311-unpaddedbase64 \
sysuser-shadow"

inherit rpm
