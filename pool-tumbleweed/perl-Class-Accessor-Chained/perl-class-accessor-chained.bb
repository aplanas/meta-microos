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

RPM_NAME = "perl-Class-Accessor-Chained-0.01-13.31.aarch64.rpm"
RPM_HASH = "e2b7095887ccc798275634d4a99f772bfc1d5a9a888a32de4676c497d4e5d521e2b6f4878e0f4fcdf2d63544baee0ba80d7257c811cea39a100f55fa4290d0ba"

RPROVIDES:${PN} += "Class-Accessor-Chained \
Class-Accessor-Chained-Fast \
perl-Class--Accessor--Chained \
perl-Class--Accessor--Chained--Fast \
perl-Class-Accessor-Chained"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor"

inherit rpm
