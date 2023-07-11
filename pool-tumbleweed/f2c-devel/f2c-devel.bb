SUMMARY = "Files for Developing with f2c"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-devel-20210928-1.4.aarch64.rpm"
RPM_HASH = "62fe73f4c720b50c68b56deecdc1c2987e885c65b21b6a3bbe828cc9dd70389b5e904d842c570646cbaa077d1f86a07f53d7f51f66c24a74740f68b87d5c7fd0"

RPROVIDES:${PN} += "f2c-devel"

RDEPENDS:${PN} += "libf2c0"

inherit rpm
