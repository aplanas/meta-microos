SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-doc-1.1.1u-5.1.noarch.rpm"
RPM_HASH = "bf0fd311572e6cb4aec670cf91d245f338f0adea3f6c9c60165292e0e7f9b3142b5a0c3be544ae468e836daa82755ee9baf2ae8299f5d70af0cccc98e7ec5369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-1-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
