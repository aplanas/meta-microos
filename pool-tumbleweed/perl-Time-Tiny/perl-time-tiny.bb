SUMMARY = "Time Object, with As Little Code As Possible"
DESCRIPTION = "*Time::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a time, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Time-Tiny-1.08-1.18.noarch.rpm"
RPM_HASH = "b80a2afb6ecfe06198215ab612e910970b55aeea39a58457f06a61cfafc98cd89e6a00092bf94ba921ff1fbab0f2ef29412d1ef6eba5f075eddf5089e906c5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Tiny \
perl-Time-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
