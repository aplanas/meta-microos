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

RPM_NAME = "python39-pytest-xvfb-2.0.0-3.3.noarch.rpm"
RPM_HASH = "75d985b7bcc8d6b6efdb716f091f69d48dc8197c518f23f909258c7e51c1275dadc129f80f83a860080ef2ffe47cbfb02a81333b2a982d49288e1af7efd6f8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-xvfb \
python39-pytest-xvfb \
python3dist-pytest-xvfb"

RDEPENDS:${PN} += "python-abi \
python39-PyVirtualDisplay \
python39-pytest \
xdpyinfo"

inherit rpm
