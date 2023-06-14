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

RPM_NAME = "perl-constant-boolean-0.02-9.24.noarch.rpm"
RPM_HASH = "53bd30097818ab48a079d0bc0e670d14b2916343d6222e61d32eda6519b4aea7e74b7cee0bde1c37772bcb9ab35693f90b5d72ab2232bb0fd5e64e5b79cb2779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-constant--boolean \
perl-constant-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Symbol--Util"

inherit rpm
