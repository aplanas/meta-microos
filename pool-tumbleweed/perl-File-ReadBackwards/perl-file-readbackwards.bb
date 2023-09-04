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

RPM_NAME = "perl-File-ReadBackwards-1.06-1.11.noarch.rpm"
RPM_HASH = "4e5447c57b95d5939177a1c9167837cf61428dac2c57da2bc08c40d134c3fbb77dfd40f529ca9972eb412c21136643f769a741565fac6183a069d4e1f93faeba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ReadBackwards \
perl-File-ReadBackwards"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
