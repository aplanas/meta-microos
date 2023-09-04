SUMMARY = "Documentation of liblangtag API"
DESCRIPTION = "The liblangtag-doc package contains documentation files for liblangtag."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.4"

RPM_NAME = "liblangtag-doc-0.6.4-1.1.noarch.rpm"
RPM_HASH = "a7b720b59cfbdc8ba6e40b4154574e5283b15276bdb33a422b355817a4e270350707e4200f2b206c501decb9c57549494372d6f2e01400980be66935a670eac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblangtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
