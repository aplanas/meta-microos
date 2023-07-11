SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-4.0.4-300.7.noarch.rpm"
RPM_HASH = "a9f49bad5e16a6081bf53eb2c1c55f0625d97874fa89f1291cfe9f7b7bad1b91fdf9d658da8d43d782a67fbb322104b5ce8b550189bbe0f3321666605cae724b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet \
servlet22 \
servlet4 \
servletapi4"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives"

inherit rpm
