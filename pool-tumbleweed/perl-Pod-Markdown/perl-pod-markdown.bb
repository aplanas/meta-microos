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

RPM_NAME = "perl-Pod-Markdown-3.300-1.11.noarch.rpm"
RPM_HASH = "45859b29e343c37c337b5ad3ecfd40e477668f57a13c46556a136fbc856d2ebb36b1fa86a7f8d9b0f731e3edc8a2914e9933677b2d5cde982da1238b355f9e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::Markdown) \
perl(Pod::Perldoc::ToMarkdown) \
perl-Pod-Markdown"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Pod::Simple) \
perl(Pod::Simple::Methody) \
perl(URI::Escape) \
perl(parent)"

inherit rpm
