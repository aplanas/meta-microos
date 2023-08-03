SUMMARY = "Test strings and data structures and show differences if not ok"
DESCRIPTION = "When the code you're testing returns multiple lines, records or data \
structures and they're just plain wrong, an equivalent to the Unix 'diff' \
utility may be just what's needed. Here's output from an example test \
script that checks two text documents and then two (trivial) data \
structures: \
 \
 t/99example....1..3 \
 not ok 1 - differences in text \
  \
  \
  \
  \
  \
  \
  \
  \
 not ok 2 - differences in whitespace \
  \
  \
  \
  \
  \
  \
  \
  \
 not ok 3 \
  \
  \
  \
  \
  \
  \
  \
  \
  \
 \
eq_or_diff_...() compares two strings or (limited) data structures and \
either emits an ok indication or a side-by-side diff. Test::Differences is \
designed to be used with Test.pm and with Test::Simple, Test::More, and \
other Test::Builder based testing modules. As the SYNOPSIS shows, another \
testing module must be used as the basis for your test suite."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.700.0"

RPM_NAME = "perl-Test-Differences-0.700.0-1.1.noarch.rpm"
RPM_HASH = "65cac8a9b0d909adc61db29eb125b9e9ad9d580b60451d302b7fb2dcbe503eb069b5e0c0591db4379e9f466eeb3db0dbc80c4ee7893f8c7becabf656aaa43305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Differences \
perl-Test-Differences"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-Data--Dumper \
perl-Test--More \
perl-Text--Diff"

inherit rpm
