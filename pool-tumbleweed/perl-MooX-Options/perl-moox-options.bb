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

RPM_NAME = "perl-MooX-Options-4.103-1.13.noarch.rpm"
RPM_HASH = "35d7764a1e7f4eecb73c4320443c3c37c4f37537c0cd00cb30dd3934ae46d5189982eeb20c46f89bb2272a8ce03fb4512d6121aaf29392e809eb7c9b88cd40ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Options \
perl-MooX--Options--Descriptive \
perl-MooX--Options--Descriptive--Usage \
perl-MooX--Options--Role \
perl-MooX-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Moo \
perl-MooX--Locale--Passthrough \
perl-Path--Class \
perl-Text--LineFold \
perl-strictures"

inherit rpm
