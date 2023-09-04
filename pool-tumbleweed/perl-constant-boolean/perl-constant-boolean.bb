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

RPM_NAME = "perl-constant-boolean-0.02-9.26.noarch.rpm"
RPM_HASH = "6c65a7238e53564c3933b304dc41b557d9ebbbb2adcf283cd70f6468f6aee5bab7071020ccd23fb46d60af1e952ecd08d9f3f58bd0a1c72f8da553b3fa587b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-constant--boolean \
perl-constant-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Symbol--Util"

inherit rpm
