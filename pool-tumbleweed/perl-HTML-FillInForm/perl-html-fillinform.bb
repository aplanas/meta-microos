SUMMARY = "Populates HTML Forms with data"
DESCRIPTION = "This module fills in an HTML form with data from a Perl data structure, \
allowing you to keep the HTML and Perl separate. \
 \
Here are two common use cases: \
 \
1. A user submits an HTML form without filling out a required field. You \
want to redisplay the form with all the previous data in it, to make it \
easy for the user to see and correct the error. \
 \
2. You have just retrieved a record from a database and need to display it \
in an HTML form."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-HTML-FillInForm-2.22-1.9.noarch.rpm"
RPM_HASH = "c2ccab32b04de7a861d7b8fabdcc512b7038c217342f392cad80a83c7e90b9c3b1eb45a900a0fa9759fb138de795d21800afc08ea7d16ccc07af9817b98f1628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FillInForm \
perl-HTML-FillInForm"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
