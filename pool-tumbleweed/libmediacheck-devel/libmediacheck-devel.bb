SUMMARY = "Library for checking installation or Live media"
DESCRIPTION = "Library for checking installation or Live media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "6.2"

RPM_NAME = "libmediacheck-devel-6.2-1.1.aarch64.rpm"
RPM_HASH = "0a4a830d2e9470753d2cfafc204fdca788cae084caead070c93cd3eef3e4c3a0ad188f3f38f409d76d1b72e340a3f2455f0c7b5f647736e845d0e922f420a647"

RPROVIDES:${PN} += "libmediacheck-devel \
libmediacheck-devel(aarch-64)"

RDEPENDS:${PN} += "libmediacheck6"

inherit rpm
