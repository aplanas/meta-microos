SUMMARY = "The Perl 6 'is export(...)' trait as a Perl 5 attribute"
DESCRIPTION = "*NOTE:* This module is a fork of Perl6::Export::Attrs created to restore \
compatibility with Perl6::Export::Attrs version 0.0.3. \
 \
Implements a Perl 5 native version of what the Perl 6 symbol export \
mechanism will look like (with some unavoidable restrictions). \
 \
It's very straightforward: \
 \
  * If you want a subroutine or package variable to be capable of being \
exported (when explicitly requested in the 'use' arguments), you mark it \
with the ':Export' attribute. \
 \
  * If you want a subroutine or package variable to be automatically exported \
when the module is used (without specific overriding arguments), you mark \
it with the ':Export(:DEFAULT)' attribute. \
 \
  * If you want a subroutine or package variable to be automatically exported \
when the module is used (even if the user specifies overriding arguments), \
you mark it with the ':Export(:MANDATORY)' attribute. \
 \
  * If the subroutine or package variable should also be exported when \
particular export groups are requested, you add the names of those export \
groups to the attribute's argument list. \
 \
That's it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1.0"

RPM_NAME = "perl-Export-Attrs-0.1.0-1.21.noarch.rpm"
RPM_HASH = "c35b3fdcb3a714ce3aea090a5fe3093f7049196693e34a0745bcec7f6b1183177ba65b12a3d02ffdb16b32a1eb80e598e3615a8a2a454de75d9ff9e9c60ec3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Export--Attrs \
perl-Export-Attrs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-PadWalker"

inherit rpm
