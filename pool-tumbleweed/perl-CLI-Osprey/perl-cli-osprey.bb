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

RPM_NAME = "perl-CLI-Osprey-0.08-1.11.noarch.rpm"
RPM_HASH = "c3f5a1f90140ed59acfb4fe1b231336446f110978ee0f7fe03b88488c6bb5b61c7419b6589ef889be971f19b6d574139fba48b904b8d706a55e58fe3a6d1cff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLI--Osprey \
perl-CLI--Osprey--Descriptive \
perl-CLI--Osprey--Descriptive--Usage \
perl-CLI--Osprey--InlineSubcommand \
perl-CLI--Osprey--Role \
perl-CLI-Osprey"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long--Descriptive \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Path--Tiny"

inherit rpm
