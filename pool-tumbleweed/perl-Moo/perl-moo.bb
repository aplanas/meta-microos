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

RPM_NAME = "perl-Moo-2.005005-1.3.noarch.rpm"
RPM_HASH = "0d064252fe5a8409c8071cd7d3f40f20e10f189bc30cd4da2f1c102b9ca2801280c21724afa5142dc6acab0b61f6039c9fdb9db83c25733e5c9f9f9db241dbb9"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Method--Modifiers \
perl-Role--Tiny \
perl-Sub--Defer \
perl-Sub--Quote"

inherit rpm
