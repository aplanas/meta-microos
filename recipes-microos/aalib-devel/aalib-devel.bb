SUMMARY = "Development Package for AAlib"
DESCRIPTION = "Files needed for developing software that uses AAlib."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-devel-1.4.0-513.3.aarch64.rpm"
RPM_HASH = "e6d93a3f0afc3fde1ad2b170ab76fa428f43074916a8b4126d1a04c8bfa437d7df05634cab02a526973b8f64a9510d39a332fc0cfe2b246af4823a96d8cea3aa"

RPROVIDES:${PN} += "aalib-devel \
aalib-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
libaa1"

inherit rpm
