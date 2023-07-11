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

RPM_NAME = "perl-Test-Class-Most-0.08-1.24.noarch.rpm"
RPM_HASH = "b66c9571347bd53a48778a8f390c74846c59c0be1d27d0938731f97ebdbf5347408d1e0e585b8955af659c613508402acab6f6dc4cd5d2f6fa19a144835edb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class--Most \
perl-Test-Class-Most"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Class \
perl-Test--Most"

inherit rpm
