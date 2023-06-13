SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*Date::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a date, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Date-Tiny-1.07-1.23.noarch.rpm"
RPM_HASH = "07efb91a2e8a056066e98a9b3fa0eb283b6d6e9e30237844d05c6392b8f818358a0872b619608a97dee3353b2f1d4c43c72901669fe0b0a59e57ba9dc011d85f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Date::Tiny) \
perl-Date-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
