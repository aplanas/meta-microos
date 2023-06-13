SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python39-apache-libcloud-3.7.0-2.1.noarch.rpm"
RPM_HASH = "d582ad302c4cb2efc4c52f5115f52d8e7a57b0a95517f62dd6199bc13422ad38e1757268e297752ee6ccbb770a44aded5acb75bc048cbc7cb54c1a123b49cf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(apache-libcloud) \
python39-apache-libcloud \
python3dist(apache-libcloud)"

RDEPENDS:${PN} += "python(abi) \
python39-lxml \
python39-requests \
python39-typing"

inherit rpm
