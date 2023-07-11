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

RPM_NAME = "perl-CLI-Osprey-0.08-1.10.noarch.rpm"
RPM_HASH = "b5d5792a7b7b6350c9e1274e3120c40e3c760f35bf306250ccdd05a27aceb464beee1182673ad8f8d0c732a292f3617a97f25c1cfd4f2ee712ecdcee48d747ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLI--Osprey \
perl-CLI--Osprey--Descriptive \
perl-CLI--Osprey--Descriptive--Usage \
perl-CLI--Osprey--InlineSubcommand \
perl-CLI--Osprey--Role \
perl-CLI-Osprey"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long--Descriptive \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Path--Tiny"

inherit rpm
