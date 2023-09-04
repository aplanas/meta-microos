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

RPM_NAME = "perl-Class-Singleton-1.6-1.13.noarch.rpm"
RPM_HASH = "df9e6d6b1700af4262edc36aaf4f59e1d718d2aeaf6baf8ac860093145959bf4f6b604b5a4cc6997fa1c554e9f249a46878bc55628677c8bd7ce99019fb507bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Singleton \
perl-Class-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
