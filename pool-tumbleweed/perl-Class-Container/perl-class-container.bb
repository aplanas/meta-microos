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

RPM_NAME = "perl-Class-Container-0.13-1.20.noarch.rpm"
RPM_HASH = "d74c8e5730b030cbe2ba60fc170b1e63cb60dcfb7cfb847a070878d08b5f304bab31b6c00b599d6c43894381710c417ccff800573a91d08a804b59be0c95ec5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Container \
perl-Class-Container"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Validate"

inherit rpm
