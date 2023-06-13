SUMMARY = "MooX::Options + MooX::Cmd + Sanity"
DESCRIPTION = "CLI::Osprey is a module to assist in writing commandline applications with \
M* OO modules (Moose, Moo, Mo). With it, you structure your app as one or \
more modules, which get instantiated with the commandline arguments as \
attributes. Arguments are parsed using Getopt::Long::Descriptive, and both \
long and short help messages as well as complete manual pages are \
automatically generated. An app can be a single command with options, or \
have sub-commands (like 'git'). Sub-commands can be defined as modules \
(with options of their own) or as simple coderefs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-CLI-Osprey-0.08-1.9.noarch.rpm"
RPM_HASH = "179b64a08c5f5e8abee95a13f84ccdaa3b277f2c99d6c58a19083c6627361e4c74ba9541b2b31a2c8d0808b6b13d80f47e22e88c7bab8686fa876e13bdc7213e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CLI::Osprey) \
perl(CLI::Osprey::Descriptive) \
perl(CLI::Osprey::Descriptive::Usage) \
perl(CLI::Osprey::InlineSubcommand) \
perl(CLI::Osprey::Role) \
perl-CLI-Osprey"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Getopt::Long::Descriptive) \
perl(Module::Runtime) \
perl(Moo) \
perl(Moo::Role) \
perl(Path::Tiny)"

inherit rpm
