SUMMARY = "Minimalist Object Orientation (with Moose compatibility)"
DESCRIPTION = "'Moo' is an extremely light-weight Object Orientation system. It allows one \
to concisely define objects and roles with a convenient syntax that avoids \
the details of Perl's object system. 'Moo' contains a subset of Moose and \
is optimised for rapid startup. \
 \
'Moo' avoids depending on any XS modules to allow for simple deployments. \
The name 'Moo' is based on the idea that it provides almost -- but not \
quite -- two thirds of Moose. As such, the Moose::Manual can serve as an \
effective guide to 'Moo' aside from the MOP and Types sections. \
 \
Unlike Mouse this module does not aim at full compatibility with Moose's \
surface syntax, preferring instead to provide full interoperability via the \
metaclass inflation capabilities described in MOO AND MOOSE. \
 \
For a full list of the minor differences between Moose and Moo's surface \
syntax, see INCOMPATIBILITIES WITH MOOSE."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.005005"

RPM_NAME = "perl-Moo-2.005005-1.2.noarch.rpm"
RPM_HASH = "d9530c4fdf2d961cfb268e445b48de00451ede7d0436103ba56e2e4b0953b637a7f31b2fe70d6d98b832cb615ce67ff0edbd0e514061f35dcae57fd1e012a11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Generate--Accessor \
perl-Method--Generate--BuildAll \
perl-Method--Generate--Constructor \
perl-Method--Generate--DemolishAll \
perl-Moo \
perl-Moo---Utils \
perl-Moo--HandleMoose \
perl-Moo--HandleMoose---TypeMap \
perl-Moo--HandleMoose--FakeConstructor \
perl-Moo--HandleMoose--FakeMetaClass \
perl-Moo--Object \
perl-Moo--Role \
perl-Moo--sification \
perl-oo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-Role--Tiny \
perl-Sub--Defer \
perl-Sub--Quote"

inherit rpm
