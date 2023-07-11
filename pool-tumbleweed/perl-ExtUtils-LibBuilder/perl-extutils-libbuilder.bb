SUMMARY = "Tool to Build C Libraries"
DESCRIPTION = "A tool to build C libraries."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-ExtUtils-LibBuilder-0.08-1.25.noarch.rpm"
RPM_HASH = "9813ab2ae4c0ef20c145187f672b5cc55b01319310386fff52ce3647e61604e07388daf76d57369c9e9a6e946c0fd097fe935442317cb882c4bb6245f7df86d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--LibBuilder \
perl-ExtUtils-LibBuilder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
