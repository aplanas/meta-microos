SUMMARY = "Run-time load a class the first time you call a method in it"
DESCRIPTION = "*Class::Autouse* is a runtime class loader that allows you to specify \
classes that will only load when a method of that class is called. \
 \
For large classes or class trees that might not be used during the running \
of a program, such as Date::Manip, this can save you large amounts of \
memory, and decrease the script load time a great deal. \
 \
*Class::Autouse* also provides a number of 'unsafe' features for runtime \
generation of classes and implementation of syntactic sugar. These features \
make use of (evil) UNIVERSAL::AUTOLOAD hooking, and are implemented in this \
class because these hooks can only be done by a one module, and \
Class::Autouse serves as a useful place to centralise this kind of evil :)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.01"

RPM_NAME = "perl-Class-Autouse-2.01-11.21.noarch.rpm"
RPM_HASH = "6c6c47d6a5d3bbc315b6d63511a0e7657a56c3d28e1a3a8059679c0126733d766492f457fa3e6823ef2b5cc290144f563d6324bf78a3ad05fb896a7fc25f3f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Autouse \
perl-Class--Autouse--Parent \
perl-Class-Autouse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
