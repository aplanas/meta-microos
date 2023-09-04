SUMMARY = "simple HTTP router"
DESCRIPTION = "Router::Simple is a simple router class. \
 \
Its main purpose is to serve as a dispatcher for web applications. \
 \
Router::Simple can match against PSGI '$env' directly, which means it's \
easy to use with PSGI supporting web frameworks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Router-Simple-0.17-1.26.noarch.rpm"
RPM_HASH = "1cba735a5269067db9c95cf13607edc511504c3af80ebb4c9ecf2fe3c0cd1d13dd3a89566f1a95e73bb0da7fc4e2a079f53a6b40ebc6d94f873fee5779a9c13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Router--Simple \
perl-Router--Simple--Declare \
perl-Router--Simple--Route \
perl-Router--Simple--SubMapper \
perl-Router-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Lite \
perl-parent"

inherit rpm
