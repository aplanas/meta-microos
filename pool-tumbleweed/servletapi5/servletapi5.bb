SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-2.0"

PV = "5.0.18"

RPM_NAME = "servletapi5-5.0.18-288.7.noarch.rpm"
RPM_HASH = "d19becf8f67f3e955a599a304279193544f3435111f1c8981a0faafcb7a425833dbfbbc3d2ac9465f0457eb33c022d6dd6375d926a19ad37d79da9737296b101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet \
servlet24 \
servlet5 \
servletapi5"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
