SUMMARY = "Framework for building reusable web-applications"
DESCRIPTION = "It is intended that your Application Module will be implemented as a \
sub-class of CGI::Application. This is done simply as follows: \
 \
    package My::App; \
    use base 'CGI::Application'; \
 \
*Notation and Conventions* \
 \
For the purpose of this document, we will refer to the following \
conventions: \
 \
  WebApp.pm   The Perl module which implements your Application Module class. \
  WebApp      Your Application Module class; a sub-class of CGI::Application. \
  webapp.cgi  The Instance Script which implements your Application Module. \
  $webapp     An instance (object) of your Application Module class. \
  $c          Same as $webapp, used in instance methods to pass around the \
              current object. (Sometimes referred as '$self' in other code)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.61"

RPM_NAME = "perl-CGI-Application-4.61-1.19.noarch.rpm"
RPM_HASH = "c9249f004408a9712df1183c10f63fb30e552d070311276f52a17dd7bca68a470474cac7bd676f9f0247679d4e00179c8294f375f0f30aab062794db0f197376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Application \
perl-CGI--Application--Mailform \
perl-CGI-Application"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CGI \
perl-Class--ISA \
perl-HTML--Template \
perl-Module--Build \
perl-Test--Requires"

inherit rpm
