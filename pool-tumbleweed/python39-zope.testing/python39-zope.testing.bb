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

RPM_NAME = "python39-zope.testing-5.0.1-2.2.noarch.rpm"
RPM_HASH = "5f12f584d956040bf71fd48a4621903bba269899a10245b231083c8e02e078a434f71dabbe2d1b0221f9034eb96a8ba5226a7cd0d9936c6ed18b1dc51691a378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.testing \
python39-zope.testing \
python3dist-zope.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
