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

RPM_NAME = "perl-Class-Container-0.13-1.21.noarch.rpm"
RPM_HASH = "a5f1d3c25a0ab6b4c31fbd3f9290244e48df09df5f9e97ede0acd2ea60839e18ba5c08bf32d0fac93c0be6f50450b7390d46153b6e1e99676b2e2e5b14fa1bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Container \
perl-Class-Container"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Validate"

inherit rpm
