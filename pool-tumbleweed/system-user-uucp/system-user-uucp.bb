SUMMARY = "System user and group uucp"
DESCRIPTION = "This package provides the system account and group 'uucp' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-uucp-20170617-24.14.noarch.rpm"
RPM_HASH = "1722033306533e70ef9a9fa9c41c7fc25843e2b36d16f0bc5863a5f92f0e92e918107cd83cb7f5257069fcb89b8ab88fe9605e872c9a2f16c82a10867358093e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(uucp) \
system-user-uucp \
user(uucp)"

RDEPENDS:${PN} += "/bin/sh \
group(lock) \
sysuser-shadow"

inherit rpm
