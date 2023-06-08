SUMMARY = "Tool that converts source archives into Debian package source"
DESCRIPTION = "This package allows you to take a standard (or upstream) source package \
and convert it into a format that will allow you to build Debian packages. \
 \
After answering a few questions, dh_make will then provide a set of \
templates that, after some small editing, will allow you to create a \
Debian package."
LICENSE = "SUSE-GPL-3.0-with-template-exception"

PV = "1.20140617"

RPM_NAME = "dh-make-1.20140617-1.17.noarch.rpm"
RPM_HASH = "b39c142586ad00e7cf37c4659d4517bb7c50cc387538c335e36c3edf3bb6fe02fcc228bf433c734b300615096c496b0b2901dda0c0d116e750fe731b5a4da0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb:/usr/bin/dh_make dh-make"
RDEPENDS:${PN} += "/bin/sh /usr/bin/make /usr/bin/perl debhelper dpkg perl"

inherit rpm
