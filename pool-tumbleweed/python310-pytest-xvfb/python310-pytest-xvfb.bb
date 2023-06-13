SUMMARY = "Pytest plugin to run Xvfb for tests"
DESCRIPTION = "A pytest plugin to run Xvfb for tests. \
 \
With Xvfb and the plugin installed, your testsuite automatically runs \
with Xvfb. This allows tests to be run without windows popping up \
during GUI tests or on systems without a display (like a CI). \
 \
If Xvfb is not installed, the plugin does not run and your tests will \
still work as normal. However, a warning message will print to standard \
output letting you know that Xvfb is not installed. \
 \
If you're currently using xvfb-run in something like .travis.yml, \
simply remove it and install this plugin instead - then you'll also have the \
benefits of Xvfb locally."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-pytest-xvfb-2.0.0-2.9.noarch.rpm"
RPM_HASH = "300d9a31aab058e0348612ae4b0b69f8810667a096af9bb663307d9f2053408a65d78900a37b07949ed506af51a19b661b2dfe37f013ca06d1b97571d2535527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xvfb \
python3.10dist(pytest-xvfb) \
python310-pytest-xvfb \
python3dist(pytest-xvfb)"

RDEPENDS:${PN} += "python(abi) \
python310-PyVirtualDisplay \
python310-pytest \
xdpyinfo"

inherit rpm
