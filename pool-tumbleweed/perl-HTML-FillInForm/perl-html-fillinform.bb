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

RPM_NAME = "perl-HTML-FillInForm-2.22-1.10.noarch.rpm"
RPM_HASH = "c0de6ad67f499871679a32c1f46c03fe701e05e5ffb934d78b2bb8495fd911661f0891c98f81b6a7aa32a835913397cd6f39046f6159364ef0d664f2488e16eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FillInForm \
perl-HTML-FillInForm"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
