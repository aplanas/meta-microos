SUMMARY = "C-Bindings development files for adms"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use adms."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-devel-2.3.7-1.10.aarch64.rpm"
RPM_HASH = "323f53cc9b78afe2afe24e82a111b2883519ab65cc1a8c61733e1c7b46b5577300ff442c269c4121342f009191119dbc4e90e88b8fef161fe3873e888386bfe5"

RPROVIDES:${PN} += "adms-devel \
adms-devel(aarch-64)"

RDEPENDS:${PN} += "libadms0"

inherit rpm
