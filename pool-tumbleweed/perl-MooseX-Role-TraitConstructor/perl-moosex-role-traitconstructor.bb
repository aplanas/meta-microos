SUMMARY = "A wrapper for C<new> that can accept a"
DESCRIPTION = "This role allows you to easily accept a 'traits' argument (or another name) \
into your constructor, which will easily mix roles into an anonymous class \
before construction, much like the Moose::Meta::Attribute manpage does."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-MooseX-Role-TraitConstructor-0.01-9.26.noarch.rpm"
RPM_HASH = "e4a3933738b7720c2ebc3cf810c5cef505dd682968e2a9449906811e2e4cbbc8d69dc7205418d5a7ae131f4a263e679b8a55f125b4d9406a0991dc2c22d5da37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--TraitConstructor \
perl-MooseX-Role-TraitConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Test--Exception \
perl-Test--use--ok"

inherit rpm
