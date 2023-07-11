SUMMARY = "Make chained accessors"
DESCRIPTION = " \
A chained accessor is one that always returns the object when called with \
parameters (to set), and the value of the field when called with no arguments. \
 \
This module subclasses Class::Accessor in order to provide the same \
mk_accessors interface. \
 \
  Authors:	Richard Clamp <richardc@unixbeard.net> \
-------------------------------------------------------------------------------"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-Class-Accessor-Chained-0.01-13.30.aarch64.rpm"
RPM_HASH = "c249e2c8f350377ec7fd1d89571f4759fbc8f4dc60be6507be3480df10689f672c80f22c6fa67415e0853a80813a433d7b1f46ca1c4b15883225f6434a1df690"

RPROVIDES:${PN} += "Class-Accessor-Chained \
Class-Accessor-Chained-Fast \
perl-Class--Accessor--Chained \
perl-Class--Accessor--Chained--Fast \
perl-Class-Accessor-Chained"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor"

inherit rpm
