SUMMARY = "Find memory cycles in objects"
DESCRIPTION = "This is a simple developer's tool for finding circular references in \
objects and other types of references. Because of Perl's reference-count \
based memory management, circular references will cause memory leaks."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.12"

RPM_NAME = "perl-Devel-Cycle-1.12-1.27.noarch.rpm"
RPM_HASH = "a994ba5c6509ab891877510149eede4b88c7a8d14b38d3a67bb6a95cb9c8a0c6f8715c8b5395428807e05263170cfbde797d68f399455dbd91f1606018281fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cycle \
perl-Devel-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
