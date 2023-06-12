SUMMARY = "Perl 5 Module for Sorting of Revision-Like Numbers"
DESCRIPTION = "Sort::Versions allows easy sorting of mixed non-numeric and numeric \
strings, like the 'version numbers' that many shared library systems and \
revision control packages use. This is quite useful if you are trying to \
deal with shared libraries. It can also be applied to applications that \
intersperse variable-width numeric fields within text. Other applications \
can undoubtedly be found. \
 \
For an explanation of the algorithm, it's simplest to look at these \
examples: \
 \
  1.1   <  1.2 \
  1.1a  <  1.2 \
  1.1   <  1.1.1 \
  1.1   <  1.1a \
  1.1.a <  1.1a \
  1     <  a \
  a     <  b \
  1     <  2 \
  1.1-3 <  1.1-4 \
  1.1-5 <  1.1.6 \
 \
More precisely (but less comprehensibly), the two strings are treated as \
subunits delimited by periods or hyphens. Each subunit can contain any \
number of groups of digits or non-digits. If digit groups are being \
compared on both sides, a numeric comparison is used, otherwise a ASCII \
ordering is used. A group or subgroup with more units will win if all \
comparisons are equal. A period binds digit groups together more tightly \
than a hyphen. \
 \
Some packages use a different style of version numbering: a simple real \
number written as a decimal. Sort::Versions has limited support for this \
style: when comparing two subunits which are both digit groups, if either \
subunit has a leading zero, then both are treated like digits after a \
decimal point. So for example: \
 \
  0002  <  1 \
  1.06  <  1.5 \
 \
This won39t always work, because there won39t always be a leading zero in \
real-number style version numbers. There is no way for Sort::Versions to \
know which style was intended. But a lot of the time it will do the right \
thing. If you are making up version numbers, the style with (possibly) more \
than one dot is the style to use."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.62"

RPM_NAME = "perl-Sort-Versions-1.62-1.25.noarch.rpm"
RPM_HASH = "0cb1baafa3cce1d1c581db372b24b80745f93653c287bb938af3f7c68ae54a3444c834fa638a7fb1b8c7be4249215e6b904d5538f45ef85b1fb7afdcc0538a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sort::Versions) \
perl-Sort-Versions"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm