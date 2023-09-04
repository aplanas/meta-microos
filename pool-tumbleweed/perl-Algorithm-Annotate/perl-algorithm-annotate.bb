SUMMARY = "represent a series of changes in annotate form"
DESCRIPTION = "Algorithm::Annotate generates a list that is useful for generating output \
simliar to 'cvs annotate'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Algorithm-Annotate-0.10-163.28.noarch.rpm"
RPM_HASH = "caa0a8627de86d716b20af2b49ef4e3cbac87cca906c3b2c57e94d0d9fe5e94cb50bde2c3bd6655dbe40bea9d9027732271bc294d69273c99688b8df88891a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Annotate \
perl-Algorithm-Annotate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Algorithm--Diff"

inherit rpm
