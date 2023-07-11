SUMMARY = "simple HTTP router"
DESCRIPTION = "Router::Simple is a simple router class. \
 \
Its main purpose is to serve as a dispatcher for web applications. \
 \
Router::Simple can match against PSGI '$env' directly, which means it's \
easy to use with PSGI supporting web frameworks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Router-Simple-0.17-1.25.noarch.rpm"
RPM_HASH = "8f4560d2df15cd4a7c3e24dc777715bdc29f8892d07c613ac4e37fe0b6bf8b4d133eba8e5a35cf34c7d8b5ba9c2f658d173cceb9e82eca37b666e609780f5efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Router--Simple \
perl-Router--Simple--Declare \
perl-Router--Simple--Route \
perl-Router--Simple--SubMapper \
perl-Router-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Lite \
perl-parent"

inherit rpm
