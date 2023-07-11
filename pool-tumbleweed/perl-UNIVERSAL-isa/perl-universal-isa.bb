SUMMARY = "Attempt to recover from people calling UNIVERSAL::isa as a function"
DESCRIPTION = "Whenever you use UNIVERSAL/isa as a function, a kitten using \
Test::MockObject dies. Normally, the kittens would be helpless, but if they \
use UNIVERSAL::isa (the module whose docs you are reading), the kittens can \
live long and prosper. \
 \
This module replaces 'UNIVERSAL::isa' with a version that makes sure that, \
when called as a function on objects which override 'isa', 'isa' will call \
the appropriate method on those objects \
 \
In all other cases, the real 'UNIVERSAL::isa' gets called directly. \
 \
*NOTE:* You should use this module only for debugging purposes. It does not \
belong as a dependency in running code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20171012"

RPM_NAME = "perl-UNIVERSAL-isa-1.20171012-1.21.noarch.rpm"
RPM_HASH = "601481f4e372db96daf978710e7639c4d037fe74507d8d9822f7c4c0f4fea988ba254de940a78f6492ad0c96e81319c289617ea2ae176d6c84df7ba74647293a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL--isa \
perl-UNIVERSAL-isa"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
