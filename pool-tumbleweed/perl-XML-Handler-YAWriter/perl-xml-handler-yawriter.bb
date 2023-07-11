SUMMARY = "Yet another Perl SAX XML Writer"
DESCRIPTION = "YAWriter implements Yet Another XML::Handler::Writer. The reasons for this \
one are that I needed a flexible escaping technique, and want some kind of \
pretty printing. If an instance of YAWriter is created without any options, \
the default behavior is to produce an array of strings containing the XML \
in : \
 \
  @{$ya->{Strings}}"
LICENSE = "GPL-1.0+"

PV = "0.23"

RPM_NAME = "perl-XML-Handler-YAWriter-0.23-5.27.noarch.rpm"
RPM_HASH = "3608b71db948c21382c64dd849a01086e350cb5dd515f8e18fd616610c6e401fd86f2bbae66d7b72cb91735190b92a61f0c05773b34e75ed5fdf35e0f42e5671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Handler--YAWriter \
perl-XML-Handler-YAWriter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-XML--Parser--PerlSAX"

inherit rpm
