SUMMARY = "Mouse role for processing command line options"
DESCRIPTION = "This is a role which provides an alternate constructor for creating objects \
using parameters passed in from the command line. \
 \
This module attempts to DWIM as much as possible with the command line \
params by introspecting your class's attributes. It will use the name of \
your attribute as the command line option, and if there is a type \
constraint defined, it will configure Getopt::Long to handle the option \
accordingly. \
 \
You can use the trait MouseX::Getopt::Meta::Attribute::Trait or the \
attribute metaclass MouseX::Getopt::Meta::Attribute to get non-default \
commandline option names and aliases. \
 \
You can use the trait MouseX::Getopt::Meta::Attribute::Trait::NoGetopt or \
the attribute metaclass MouseX::Getopt::Meta::Attribute::NoGetopt to have \
'MouseX::Getopt' ignore your attribute in the commandline options. \
 \
By default, attributes which start with an underscore are not given \
commandline argument support, unless the attribute's metaclass is set to \
MouseX::Getopt::Meta::Attribute. If you don't want your accessors to have \
the leading underscore in their name, you can do this: \
 \
   \
  has '_foo' => (accessor => 'foo', ...); \
 \
   \
  has '_bar' => (reader => 'bar', ...); \
 \
This will mean that Getopt will not handle a --foo param, but your code can \
still call the 'foo' method. \
 \
If your class also uses a configfile-loading role based on \
MouseX::ConfigFromFile, such as MouseX::SimpleConfig, MouseX::Getopt's \
'new_with_options' will load the configfile specified by the '--configfile' \
option (or the default you've given for the configfile attribute) for you. \
 \
Options specified in multiple places follow the following precedence order: \
commandline overrides configfile, which overrides explicit new_with_options \
parameters."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.38"

RPM_NAME = "perl-MouseX-Getopt-0.38-1.11.noarch.rpm"
RPM_HASH = "65770d8ded09e81a076526f00b4c29a6d18974f7ae1a66d496309402ef2954d243f72e2d292eb7c6f3f4dc434032e43c18e1a97cf0e3941e5606f256dc60f215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Getopt \
perl-MouseX--Getopt--Basic \
perl-MouseX--Getopt--Dashes \
perl-MouseX--Getopt--GLD \
perl-MouseX--Getopt--Meta--Attribute \
perl-MouseX--Getopt--Meta--Attribute--NoGetopt \
perl-MouseX--Getopt--Meta--Attribute--Trait \
perl-MouseX--Getopt--Meta--Attribute--Trait--NoGetopt \
perl-MouseX--Getopt--OptionTypeMap \
perl-MouseX--Getopt--Strict \
perl-MouseX-Getopt \
perl-mousex-getopt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-Mouse \
perl-Mouse--Meta--Attribute \
perl-Mouse--Role \
perl-Mouse--Util--TypeConstraints"

inherit rpm
