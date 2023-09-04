SUMMARY = "Provides basic first-pass API testing for large class trees"
DESCRIPTION = "For many APIs with large numbers of classes, it can be very useful to be \
able to do a quick once-over to make sure that classes, methods, and \
inheritance is correct, before doing more comprehensive testing. This \
module aims to provide such a capability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Test-ClassAPI-1.07-1.21.noarch.rpm"
RPM_HASH = "7ea9c232687ceb4906a0dcb571df3cbb2231a30e33c27b99132799d19c58c9b6cca93d65ae1723c8423b4ac766a30451622bf756a66fa9d781ecb2ad4c2c5594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--ClassAPI \
perl-Test-ClassAPI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Inspector \
perl-Config--Tiny \
perl-Params--Util"

inherit rpm
