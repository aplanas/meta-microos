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

RPM_NAME = "perl-CGI-Application-4.61-1.17.noarch.rpm"
RPM_HASH = "4e3396df20a729d6eb86e87fa3c5ed11e701df20a13fc1b9b82c3022771eac0e36b3cab2b0fd662d4523d4ab6d4affd6c734f56376ee1cf8654062aae9dc389e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CGI::Application) \
perl(CGI::Application::Mailform) \
perl-CGI-Application"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CGI) \
perl(Class::ISA) \
perl(HTML::Template) \
perl(Module::Build) \
perl(Test::Requires)"

inherit rpm
