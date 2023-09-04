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

RPM_NAME = "perl-Pod-Coverage-TrustPod-0.100006-1.4.noarch.rpm"
RPM_HASH = "a6b0aeb258a5c693abfe98fe06482b2ba2f3fe89416eec793744555c68cad0a5e0fbdde55437ea07a6b084cf5df813f4628454975bf7eff9913d6889433a9e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage--TrustPod \
perl-Pod-Coverage-TrustPod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Coverage--CountParents \
perl-Pod--Eventual--Simple \
perl-Pod--Find"

inherit rpm
