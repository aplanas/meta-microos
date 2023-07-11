SUMMARY = "sort lexically, but sort numeral parts numerically"
DESCRIPTION = "This module exports two functions, 'nsort' and 'ncmp'; they are used in \
implementing my idea of a 'natural sorting' algorithm. Under natural \
sorting, numeric substrings are compared numerically, and other \
word-characters are compared lexically. \
 \
This is the way I define natural sorting: \
 \
* * \
 \
  Non-numeric word-character substrings are sorted lexically, \
  case-insensitively: 'Foo' comes between 'fish' and 'fowl'. \
 \
* * \
 \
  Numeric substrings are sorted numerically: '100' comes after '20', not \
  before. \
 \
* * \
 \
  \\W substrings (neither words-characters nor digits) are _ignored_. \
 \
* * \
 \
  Our use of \\w, \\d, \\D, and \\W is locale-sensitive: Sort::Naturally uses a \
  'use locale' statement. \
 \
* * \
 \
  When comparing two strings, where a numeric substring in one place is \
  _not_ up against a numeric substring in another, the non-numeric always \
  comes first. This is fudged by reading pretending that the lack of a \
  number substring has the value -1, like so: \
 \
    foo       =>  'foo',  -1 \
    foobar    =>  'foo',  -1,  'bar' \
    foo13     =>  'foo',  13, \
    foo13xyz  =>  'foo',  13,  'xyz' \
 \
  That's so that 'foo' will come before 'foo13', which will come before \
  'foobar'. \
 \
* * \
 \
  The start of a string is exceptional: leading non-\\W (non-word, \
  non-digit) components are are ignored, and numbers come _before_ letters. \
 \
* * \
 \
  I define 'numeric substring' just as sequences matching m/\\d+/ -- \
  scientific notation, commas, decimals, etc., are not seen. If your data \
  has thousands separators in numbers ('20,000 Leagues Under The Sea' or \
  '20.000 lieues sous les mers'), consider stripping them before feeding \
  them to 'nsort' or 'ncmp'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-Sort-Naturally-1.03-5.27.noarch.rpm"
RPM_HASH = "fe26e4d1dce6ebc58c639f0ab2590ae6875c63718769d8e4815f7574b0c9bc956264863bb6ffcd36b0be9bdabcc94f2989d32fc135f3689b8b2895a63ee79848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sort--Naturally \
perl-Sort-Naturally"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
