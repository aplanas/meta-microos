SUMMARY = "Glues object frameworks together transparently"
DESCRIPTION = "This class facilitates building frameworks of several classes that \
inter-operate. It was first designed and built for 'HTML::Mason', in which \
the Compiler, Lexer, Interpreter, Resolver, Component, Buffer, and several \
other objects must create each other transparently, passing the appropriate \
parameters to the right class, possibly substituting other subclasses for \
any of these objects. \
 \
The main features of 'Class::Container' are: \
 \
  * Explicit declaration of containment relationships (aggregation, factory \
creation, etc.) \
 \
  * Declaration of constructor parameters accepted by each member in a class \
framework \
 \
  * Transparent passing of constructor parameters to the class that needs them \
 \
  * Ability to create one (automatic) or many (manual) contained objects \
automatically and transparently"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-Class-Container-0.13-1.19.noarch.rpm"
RPM_HASH = "c4afbb686d92db552529827858bd713bd7d742ece72a29ee731a0b13a509495c2c2ea49853125736145ffc84119c33cfd4d10a948c46c736a234b2910c847313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Container) \
perl-Class-Container"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Params::Validate)"

inherit rpm
