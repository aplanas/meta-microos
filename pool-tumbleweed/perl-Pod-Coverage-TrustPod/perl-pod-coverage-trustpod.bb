SUMMARY = "Allow a module's pod to contain Pod::Coverage hints"
DESCRIPTION = "This is a Pod::Coverage subclass (actually, a subclass of \
Pod::Coverage::CountParents) that allows the POD itself to declare certain \
symbol names trusted. \
 \
Here is a sample Perl module: \
 \
  package Foo::Bar; \
 \
  =head1 NAME \
 \
  Foo::Bar - a bar at which fooes like to drink \
 \
  =head1 METHODS \
 \
  =head2 fee \
 \
  returns the bar tab \
 \
  =cut \
 \
  sub fee { ... } \
 \
  =head2 fie \
 \
  scoffs at bar tab \
 \
  =cut \
 \
  sub fie { ... } \
 \
  sub foo { ... } \
 \
  =begin Pod::Coverage \
 \
    foo \
 \
  =end Pod::Coverage \
 \
  =cut \
 \
This file would report full coverage, because any non-empty lines inside a \
block of POD targeted to Pod::Coverage are treated as 'trustme' patterns. \
Leading and trailing whitespace is stripped and the remainder is treated as \
a regular expression anchored at both ends. \
 \
Remember, anywhere you could use '=begin' and '=end' as above, you could \
instead write: \
 \
  =for Pod::Coverage foo \
 \
In some cases, you may wish to make the entire file trusted. The special \
pattern '*EVERYTHING*' may be provided to do just this. \
 \
Keep in mind that Pod::Coverage::TrustPod sets up exceptions using the \
'trust' mechanism rather than the 'privacy' mechanism in Pod::Coverage. \
This is unlikely ever to matter to you, but it's true."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100006"

RPM_NAME = "perl-Pod-Coverage-TrustPod-0.100006-1.3.noarch.rpm"
RPM_HASH = "b4069191a8d36b52b92a00b425ec03fbba80ee9602cb5b924d48f6ca288c2a11c4c5e40177b43d8880d83f9ed2ee8e673533ef90c085f06ac8f6b4a8039a0013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage--TrustPod \
perl-Pod-Coverage-TrustPod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Coverage--CountParents \
perl-Pod--Eventual--Simple \
perl-Pod--Find"

inherit rpm
