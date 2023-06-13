SUMMARY = "Tool to Build C Libraries"
DESCRIPTION = "A tool to build C libraries."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-ExtUtils-LibBuilder-0.08-1.24.noarch.rpm"
RPM_HASH = "dc0e7fec04b41837d4ad0082b9e973485ae0e54951eaab1c3cb31500d51948ba343a8e5a59060cffa327c7348e5f74c2477f97df07ee9d71e08b14e6ac60717d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::LibBuilder) \
perl-ExtUtils-LibBuilder"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
