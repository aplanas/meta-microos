SUMMARY = "Implementation of a 'Singleton' class"
DESCRIPTION = "This is the 'Class::Singleton' module. A Singleton describes an object \
class that can have only one instance in any system. An example of a \
Singleton might be a print spooler or system registry. This module \
implements a Singleton class from which other classes can be derived. By \
itself, the 'Class::Singleton' module does very little other than manage \
the instantiation of a single object. In deriving a class from \
'Class::Singleton', your module will inherit the Singleton instantiation \
method and can implement whatever specific functionality is required. \
 \
For a description and discussion of the Singleton class, see 'Design \
Patterns', Gamma et al, Addison-Wesley, 1995, ISBN 0-201-63361-2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.6"

RPM_NAME = "perl-Class-Singleton-1.6-1.12.noarch.rpm"
RPM_HASH = "e6e25c0bcd37ea8206816cf15b8f27435a8bcfc66f52d553f8e7193032a05ee94e58db5b5ad616bb3a733c5c9fdedbfc28be8ff5d1589ccf84add0120d55c29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Singleton \
perl-Class-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
