SUMMARY = "A wrapper for C<new> that can accept a"
DESCRIPTION = "This role allows you to easily accept a 'traits' argument (or another name) \
into your constructor, which will easily mix roles into an anonymous class \
before construction, much like the Moose::Meta::Attribute manpage does."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-MooseX-Role-TraitConstructor-0.01-9.27.noarch.rpm"
RPM_HASH = "1ae52f8811066f61bc55a097272bc8991d7594957621e663e8a305a9fb9755ab09ab129c112b32cec06d4806fe70a64fd388f32c6a0b7f3a90296dfab3a2cdf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--TraitConstructor \
perl-MooseX-Role-TraitConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Test--Exception \
perl-Test--use--ok"

inherit rpm
