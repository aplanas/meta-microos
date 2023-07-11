SUMMARY = "(DEPRECATED) Test::Exception simplified"
DESCRIPTION = "(DEPRECATED) Test::Exception simplified"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Test-Exception-LessClever-0.009-1.25.noarch.rpm"
RPM_HASH = "247663989399e248edcc667c99f9358c0b01ccd25ab1ad9093b3350c7b4e19796b3a552c43e1050f8cee8729ef3fcf67b43fff358c62f6cc2816c7fc61217ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Exception--LessClever \
perl-Test-Exception-LessClever"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
