SUMMARY = "Time Object, with As Little Code As Possible"
DESCRIPTION = "*Time::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a time, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Time-Tiny-1.08-1.19.noarch.rpm"
RPM_HASH = "2a21992646e430937ffa11dd788df152a21d04aa883c79368c477049c2fe200f326e0f163c3c5ae6b10006e574421c4984966bc7635079d125d9cf8e061f8162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Tiny \
perl-Time-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
