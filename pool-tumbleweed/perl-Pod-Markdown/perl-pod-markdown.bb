SUMMARY = "Convert POD to Markdown"
DESCRIPTION = "This module uses Pod::Simple to convert POD to Markdown. \
 \
Literal characters in Pod that are special in Markdown (like *asterisks*) \
are backslash-escaped when appropriate. \
 \
By default 'markdown' and 'html' formatted regions are accepted. Regions of \
'markdown' will be passed through unchanged. Regions of 'html' will be \
placed inside a '<div>' tag so that markdown characters won't be processed. \
Regions of ':markdown' or ':html' will be processed as POD and included. To \
change which regions are accepted use the Pod::Simple API: \
 \
  my $parser = Pod::Markdown->new; \
  $parser->unaccept_targets(qw( markdown html ));"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.300"

RPM_NAME = "perl-Pod-Markdown-3.300-1.13.noarch.rpm"
RPM_HASH = "d40b716383e39091cb6d74267634d9a701f58f0867459f9403eba8658e7525ed779e3c3f9ff04cecab2cf6c204b4f350c89a1418f5435584d908bcdb08363421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Markdown \
perl-Pod--Perldoc--ToMarkdown \
perl-Pod-Markdown"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Simple \
perl-Pod--Simple--Methody \
perl-URI--Escape \
perl-parent"

inherit rpm
