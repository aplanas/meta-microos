SUMMARY = "Work with a range of dates"
DESCRIPTION = "Quite often, when dealing with dates, we don't just want to know \
information about one particular date, but about a range of dates. For \
example, we may wish to know whether a given date is in a particular range, \
or what the overlap is between one range and another. This module lets you \
ask such questions."
LICENSE = "GPL-2.0-or-later"

PV = "1.41"

RPM_NAME = "perl-Date-Range-1.41-1.11.noarch.rpm"
RPM_HASH = "4fb469dac884cfd7c4adb7f0ff5cb0af33f958cb18c8627c1832e4d3688a58ddd1e80dfbad57c108c3aaa84f1fa6ed84b35cbb751a8c1ef86e2ea05a1fed4bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Range \
perl-Date-Range"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Simple"

inherit rpm
