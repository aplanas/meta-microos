SUMMARY = "Supporting module for SOAP::Lite"
DESCRIPTION = "supporting module for SOAP::Lite"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-IO-SessionData-1.03-3.27.noarch.rpm"
RPM_HASH = "0d8bd66af623467a71c31d8b776a867c02077b4e11e7b168e8b967b8ca00e03b22259fae077f11f8c6a329b76171bde7645090644f50506b8c7ca636dd4d7245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::SessionData) \
perl(IO::SessionSet) \
perl-IO-SessionData"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
