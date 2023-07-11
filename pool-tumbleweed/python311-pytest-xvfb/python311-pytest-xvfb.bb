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

RPM_NAME = "python311-pytest-xvfb-2.0.0-3.3.noarch.rpm"
RPM_HASH = "4639be3a7fba6288e50b5ac79768586886cee603e171a990ca9fadddbbf5936acf1d5b87b0909e8770941b51c78b232f86316584df287f8ba60fba0ddf9b3df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xvfb \
python3.11dist-pytest-xvfb \
python311-pytest-xvfb \
python3dist-pytest-xvfb"

RDEPENDS:${PN} += "python-abi \
python311-PyVirtualDisplay \
python311-pytest \
xdpyinfo"

inherit rpm
