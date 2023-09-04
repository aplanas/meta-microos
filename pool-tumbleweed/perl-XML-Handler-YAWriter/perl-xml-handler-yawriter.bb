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

RPM_NAME = "perl-XML-Handler-YAWriter-0.23-5.28.noarch.rpm"
RPM_HASH = "f889ac3c9c7e9d00e91fbdf80c2ccd771bc13c6b530753486aad978e5e54dc5b5608418b83054847442a27a95999d347ee044f318dce8d943991a836459cd599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Handler--YAWriter \
perl-XML-Handler-YAWriter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-XML--Parser--PerlSAX"

inherit rpm
