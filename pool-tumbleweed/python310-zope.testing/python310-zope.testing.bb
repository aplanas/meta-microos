SUMMARY = "Zope testing helpers"
DESCRIPTION = "This package provides a number of testing frameworks. \
 \
cleanup \
  Provides a mixin class for cleaning up after tests that \
  make global changes. \
 \
formparser \
  An HTML parser that extracts form information. \
 \
  **Python 2 only** \
 \
  This is intended to support functional tests that need to extract \
  information from HTML forms returned by the publisher. \
 \
  See formparser.txt. \
 \
loggingsupport \
  Support for testing logging code \
 \
  If you want to test that your code generates proper log output, you \
  can create and install a handler that collects output. \
 \
loghandler \
  Logging handler for tests that check logging output. \
 \
module \
  Lets a doctest pretend to be a Python module. \
 \
  See module.txt. \
 \
renormalizing \
  Regular expression pattern normalizing output checker. \
  Useful for doctests. \
 \
server \
  Provides a simple HTTP server compatible with the zope.app.testing \
  functional testing API.  Lets you interactively play with the system \
  under test.  Helpful in debugging functional doctest failures. \
 \
  **Python 2 only** \
 \
setupstack \
  A simple framework for automating doctest set-up and tear-down. \
  See setupstack.txt. \
 \
wait \
  A small utility for dealing with timing non-determinism \
  See wait.txt."
LICENSE = "ZPL-2.1"

PV = "5.0.1"

RPM_NAME = "python310-zope.testing-5.0.1-2.1.noarch.rpm"
RPM_HASH = "4286b3c40b43b12d4caaf32a0e9e9c9595700f31dbf2c78612a4c17d55eaddb138a91c9ef28f8bea4cf95186e0d645206c20efec03d862756673badc04426d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testing \
python3.10dist(zope.testing) \
python310-zope.testing \
python3dist(zope.testing)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
