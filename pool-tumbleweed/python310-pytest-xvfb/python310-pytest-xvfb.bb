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

RPM_NAME = "python310-pytest-xvfb-2.0.0-3.3.noarch.rpm"
RPM_HASH = "70cd2cf4c56e9ec6a638f8d43f0484213f7befd53e5fbcbdf8e9ddfdc9f793c5e73ae14c08073ab7dfbfc3904cf6d72c98ded6d03383cc9fe76e0087f4198acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-xvfb \
python310-pytest-xvfb \
python3dist-pytest-xvfb"

RDEPENDS:${PN} += "python-abi \
python310-PyVirtualDisplay \
python310-pytest \
xdpyinfo"

inherit rpm
