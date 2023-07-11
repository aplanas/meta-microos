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

RPM_NAME = "perl-Pod-Markdown-3.300-1.12.noarch.rpm"
RPM_HASH = "553594c1575f51e40e2d73c8752c2a4910ee1b8003f20efb5a40c55a2159782e8178a4fb1f5e2fa65f27c709b4f9a6a0256597563f059f6bd178c3952d03ed1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Markdown \
perl-Pod--Perldoc--ToMarkdown \
perl-Pod-Markdown"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Simple \
perl-Pod--Simple--Methody \
perl-URI--Escape \
perl-parent"

inherit rpm
