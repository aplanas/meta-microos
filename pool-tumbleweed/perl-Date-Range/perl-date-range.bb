SUMMARY = "Work with a range of dates"
DESCRIPTION = "Quite often, when dealing with dates, we don't just want to know \
information about one particular date, but about a range of dates. For \
example, we may wish to know whether a given date is in a particular range, \
or what the overlap is between one range and another. This module lets you \
ask such questions."
LICENSE = "GPL-2.0-or-later"

PV = "1.41"

RPM_NAME = "perl-Date-Range-1.41-1.10.noarch.rpm"
RPM_HASH = "7f68f9a7f618e978f140949ec88e76e62bfe21931aaae6e35f53315e14ccf9fe61fcf75f3549a72f686530f41b691f68d26118d960e91055c00c45b6180ac4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Range \
perl-Date-Range"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Simple"

inherit rpm
