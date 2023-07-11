SUMMARY = "Read a file backwards by lines"
DESCRIPTION = "This module reads a file backwards line by line. It is simple to use, \
memory efficient and fast. It supports both an object and a tied handle \
interface. \
 \
It is intended for processing log and other similar text files which \
typically have their newest entries appended to them. By default files are \
assumed to be plain text and have a line ending appropriate to the OS. But \
you can set the input record separator string on a per file basis."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-File-ReadBackwards-1.06-1.10.noarch.rpm"
RPM_HASH = "ac2d6abeac20456dafd6f9760104a922020d17b2212e1fea3e85b96e67c861385110842d68ae574a56447a1f68c3b182edd4bec2c65e0caf02ec9476b23c7525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ReadBackwards \
perl-File-ReadBackwards"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
