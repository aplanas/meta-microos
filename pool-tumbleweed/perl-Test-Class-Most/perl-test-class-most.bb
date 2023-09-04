SUMMARY = "Test Classes the easy way"
DESCRIPTION = "When people write test classes with the excellent 'Test::Class', you often \
see the following at the top of the code: \
 \
  package Some::Test::Class; \
 \
  use strict; \
  use warnings; \
  use base 'My::Test::Class'; \
  use Test::More; \
  use Test::Exception; \
 \
   \
 \
That's a lot of boilerplate and I don't like boilerplate. So now you can do \
this: \
 \
  use Test::Class::Most parent => 'My::Test::Class'; \
 \
That automatically imports the strict manpage and the warnings manpage for \
you. It also gives you all of the testing goodness from the Test::Most \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Test-Class-Most-0.08-1.25.noarch.rpm"
RPM_HASH = "157a285c8f9b5c5432473953b16b66d0712b088db4a6d5b86ada55e7669c576b96a865cf4070ab908e8ee17860bc717dc2c4cf7641db5ed4cb44e87c767bfd6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class--Most \
perl-Test-Class-Most"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Class \
perl-Test--Most"

inherit rpm
