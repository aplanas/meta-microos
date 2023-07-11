SUMMARY = "Select a pager (possibly perl-based) & pipe it text if a TTY"
DESCRIPTION = "IO::Pager can be used to locate an available pager and set the _PAGER_ \
environment variable (see NOTES). It is also a factory for creating I/O \
objects such as IO::Pager::Buffered and IO::Pager::Unbuffered. \
 \
IO::Pager subclasses are designed to programmatically decide whether or not \
to pipe a filehandle's output to a program specified in _PAGER_. Subclasses \
may implement only the IO handle methods desired and inherit the remainder \
of those outlined below from IO::Pager. For anything else, YMMV. See the \
appropriate subclass for implementation specific details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.10"

RPM_NAME = "perl-IO-Pager-2.10-1.12.noarch.rpm"
RPM_HASH = "3c123ec7236f78064f1957beb6eb361bb7405e67e0092fa99226e0f2d51e8f18506fa032bbedf2bd9646e0ab28a5b60a2ef88b4ba88764a5ecdbdd995ba06d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Pager \
perl-IO--Pager--Buffered \
perl-IO--Pager--Page \
perl-IO--Pager--Perl \
perl-IO--Pager--Unbuffered \
perl-IO--Pager--less \
perl-IO-Pager"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-Term--ReadKey"

inherit rpm
