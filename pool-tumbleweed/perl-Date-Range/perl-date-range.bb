SUMMARY = "Work with a range of dates"
DESCRIPTION = "Quite often, when dealing with dates, we don't just want to know \
information about one particular date, but about a range of dates. For \
example, we may wish to know whether a given date is in a particular range, \
or what the overlap is between one range and another. This module lets you \
ask such questions."
LICENSE = "GPL-2.0-or-later"

PV = "1.41"

RPM_NAME = "perl-Date-Range-1.41-1.9.noarch.rpm"
RPM_HASH = "3150b59a9956203105b4da0b16c59f31679df8e2836eafa6e72de657ec019de1df53b86b62116e41133469b5b38344e1304b197fb00822fec8b235117d416111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Range \
perl-Date-Range"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Date--Simple"

inherit rpm
