SUMMARY = "simple HTTP router"
DESCRIPTION = "Router::Simple is a simple router class. \
 \
Its main purpose is to serve as a dispatcher for web applications. \
 \
Router::Simple can match against PSGI '$env' directly, which means it's \
easy to use with PSGI supporting web frameworks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Router-Simple-0.17-1.24.noarch.rpm"
RPM_HASH = "01b76b921d51722a26fa5ab4de09a1fb10b712f115e59980d362036ff337f9fec05eaa9c0802784a8a3b9ff037b14210293ca2bfb62e1ade0180859dcdabe209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Router::Simple) \
perl(Router::Simple::Declare) \
perl(Router::Simple::Route) \
perl(Router::Simple::SubMapper) \
perl-Router-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor::Lite) \
perl(parent)"

inherit rpm
