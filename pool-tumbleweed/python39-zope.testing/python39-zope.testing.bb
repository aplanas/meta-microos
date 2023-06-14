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

RPM_NAME = "python39-zope.testing-5.0.1-2.1.noarch.rpm"
RPM_HASH = "72677c4bbae0eb9fae04e195b2cb308a3d7a35bec54c9a4546bc3a197482b67f233a7e49c5c9aec40d5207eb1af5c0234310dd3d3c2c3782b78f2a0f590a2bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.testing \
python39-zope.testing \
python3dist-zope.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
