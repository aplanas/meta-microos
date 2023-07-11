SUMMARY = "Turns ref() into a multimethod"
DESCRIPTION = "This module changes the behavior of the builtin function ref(). If ref() is \
called on an object that has requested an overloaded ref, the object's \
'->ref' method will be called and its return value used instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-UNIVERSAL-ref-0.14-1.14.aarch64.rpm"
RPM_HASH = "edbf40e63bd590f191319a0291c1cad2abafae509cd6da9f008cc3e77885210f27d1fd9a688abceadb6fc02ab9229835baf65f43f8b77e98e7d6c26ac05765bc"

RPROVIDES:${PN} += "perl-UNIVERSAL--ref \
perl-UNIVERSAL-ref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Utils"

inherit rpm
