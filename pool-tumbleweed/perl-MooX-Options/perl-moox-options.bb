SUMMARY = "Explicit Options eXtension for Object Class"
DESCRIPTION = "Create a command line tool with your Moo, Moose objects. \
 \
Everything is explicit. You have an 'option' keyword to replace the usual \
'has' to explicitly use your attribute into the command line. \
 \
The 'option' keyword takes additional parameters and uses \
Getopt::Long::Descriptive to generate a command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.103"

RPM_NAME = "perl-MooX-Options-4.103-1.12.noarch.rpm"
RPM_HASH = "b4147ca352391710e1b18b0b4cdb04201e7d3559adae7899fc23637e296a3167f2dc7b7b26c0bd18ececbf5137286a1c860dcb13afb0a121e94bab74a73e3e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Options) \
perl(MooX::Options::Descriptive) \
perl(MooX::Options::Descriptive::Usage) \
perl(MooX::Options::Role) \
perl-MooX-Options"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Getopt::Long) \
perl(Getopt::Long::Descriptive) \
perl(MRO::Compat) \
perl(Module::Runtime) \
perl(Moo) \
perl(MooX::Locale::Passthrough) \
perl(Path::Class) \
perl(Text::LineFold) \
perl(strictures)"

inherit rpm
