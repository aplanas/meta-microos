SUMMARY = "Files for SMI-S generic array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-smis-plugin package contains plug-in for generic \
Storage Management Initiative Specification (SMI-S) array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-smis-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "c3b886d9e5a34402a5557f5877084fe03b8dca6f5870c635cb445b041dca07802711f76fb191648a1fc3ddb9de4b7743ae3e65fc25dec64736a42bccf11adad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-smis-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt \
python3-pywbem"

inherit rpm
