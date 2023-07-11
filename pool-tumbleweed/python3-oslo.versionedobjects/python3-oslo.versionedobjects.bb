SUMMARY = "Oslo Versioned Objects library"
DESCRIPTION = "oslo.versionedobjects library deals with DB schema being at different versions \
than the code expects, allowing services to be operated safely during upgrades. \
It enables DB independent schema by providing an abstraction layer, which \
allows us to support SQL and NoSQL Databases. oslo.versionedobjects is also \
used in RPC APIs, to ensure upgrades happen without spreading version dependent \
code across different services and projects. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-oslo.versionedobjects-3.1.0-1.3.noarch.rpm"
RPM_HASH = "8b7ff99f13d320628f4e3a2f194d6a09812ce749895ededd246cac2b53f284163e1eff4b1b8ded316c43251aa08ce9910fb1af9b1d56b1fb161b4acbda36edb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.versionedobjects \
python3.11dist-oslo.versionedobjects \
python3dist-oslo.versionedobjects"

RDEPENDS:${PN} += "python-abi \
python3-WebOb \
python3-iso8601 \
python3-netaddr \
python3-oslo.concurrency \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.messaging \
python3-oslo.serialization \
python3-oslo.utils"

inherit rpm
