SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.19"

RPM_NAME = "python39-mysql-connector-python-8.0.19-2.17.noarch.rpm"
RPM_HASH = "1fcc275a88611e54a5fed4734453740c065d283a4c39d1d68222858cf9f339d1e64877bb8f8b6c61380d941f07c06883cb5b8bd73a14eb29f36aad8c890bed27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mysql-connector-python \
python39-mysql-connector-python \
python3dist-mysql-connector-python"

RDEPENDS:${PN} += "python-abi \
python39-dnspython \
python39-protobuf"

inherit rpm
