SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python311-mysql-connector-python-8.0.19-2.17.noarch.rpm"
RPM_HASH = "19c228c0f27f534fb49a3e89bc1d52ac2279620694722843fdc719eff8b35ebd6f683f331cb4ff5e36423a5dc1feea00cc593e71abb42733a6439ab8b8b00a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mysql-connector-python \
python3.11dist-mysql-connector-python \
python311-mysql-connector-python \
python3dist-mysql-connector-python"

RDEPENDS:${PN} += "python-abi \
python311-dnspython \
python311-protobuf"

inherit rpm
