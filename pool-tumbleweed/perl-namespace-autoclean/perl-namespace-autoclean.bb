SUMMARY = "Keep imports out of your namespace"
DESCRIPTION = "When you import a function into a Perl package, it will naturally also be \
available as a method. \
 \
The 'namespace::autoclean' pragma will remove all imported symbols at the \
end of the current package's compile cycle. Functions called in the package \
itself will still be bound by their name, but they won't show up as methods \
on your class or instances. \
 \
This module is very similar to namespace::clean, except it will clean all \
imported functions, no matter if you imported them before or after you \
'use'd the pragma. It will also not touch anything that looks like a \
method. \
 \
If you're writing an exporter and you want to clean up after yourself (and \
your peers), you can use the '-cleanee' switch to specify what package to \
clean: \
 \
  package My::MooseX::namespace::autoclean; \
  use strict; \
 \
  use namespace::autoclean (); # no cleanup, just load \
 \
  sub import { \
      namespace::autoclean->import( \
        -cleanee => scalar(caller), \
      ); \
  }"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.29"

RPM_NAME = "perl-namespace-autoclean-0.29-1.17.noarch.rpm"
RPM_HASH = "0ac63a970f42c9c08ae5e4358fa4282925871702a9c923e97b76e67a995029e7c1aef08feb7bca715e03b2d4b8c70d2ac7b27ea55da09917cc6f18f8084d3ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-namespace--autoclean \
perl-namespace-autoclean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--EndOfScope \
perl-Sub--Identify \
perl-namespace--clean"

inherit rpm
