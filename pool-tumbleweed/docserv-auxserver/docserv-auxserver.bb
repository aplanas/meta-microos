SUMMARY = "Docserv auxiliary service endpoints"
DESCRIPTION = "docserv-auxserver has a very efficient, small map to redirect to the correct manual page for rpm2docserv created html repositories."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-auxserver-20230308.4ed55cf-1.4.aarch64.rpm"
RPM_HASH = "6858f2faa27e05e20cb863a0e40ec146af36b2f5051e97cd1b9bcd26d950fefc746c8756ff8afd6736be84a0c03f4c5a06d406ba02646c2665e295a1010afe2a"

RPROVIDES:${PN} += "docserv-auxserver \
docserv-auxserver(aarch-64) \
group(docserv-aux) \
user(docserv-aux)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
sysuser-shadow"

inherit rpm
