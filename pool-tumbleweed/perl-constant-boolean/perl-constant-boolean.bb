SUMMARY = "Define TRUE and FALSE constants."
DESCRIPTION = "Defines 'TRUE' and 'FALSE' constants in caller's namespace. You could use \
simple values like empty string or zero for false, or any non-empty and \
non-zero string value as true, but the 'TRUE' and 'FALSE' constants are \
more descriptive. \
 \
It is virtually the same as: \
 \
   \
  use constant TRUE => !! 1; \
  use constant FALSE => !! ''; \
 \
The constants exported by 'constant::boolean' are not reported by the \
Test::Pod::Coverage manpage, so it is more convenient to use this module \
than to define 'TRUE' and 'FALSE' constants by yourself. \
 \
The constants can be removed from class API with 'no constant::boolean' \
pragma or some universal tool like the namespace::clean manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-constant-boolean-0.02-9.25.noarch.rpm"
RPM_HASH = "9903978407bd84709f4e9fa757806f91a88ff2dbb2c1fe509c46ab19042165fde196cb8d4c13735e3c03d58217bd71534e41fc31d8ed03d372e19c667384784b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-constant--boolean \
perl-constant-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Symbol--Util"

inherit rpm
