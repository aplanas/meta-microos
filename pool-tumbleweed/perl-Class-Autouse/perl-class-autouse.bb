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

RPM_NAME = "perl-Class-Autouse-2.01-11.22.noarch.rpm"
RPM_HASH = "7d00f725ec41bf579c9ef8ccf066a9462d2c0a097d0a67ff26ab1f37eae827780380f6c93bb8fcd1596b1b088ac933f53254f08b14c33411d1ab08e6e67f7eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Autouse \
perl-Class--Autouse--Parent \
perl-Class-Autouse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
