SUMMARY = "Pytest plugin to abort hanging tests"
DESCRIPTION = "This is a plugin which will terminate tests after a certain timeout. \
When doing so it will show a stack dump of all threads running at the \
time.  This is useful when running tests under a continuous \
integration server or simply if you don't know why the test suite \
hangs. \
 \
Note that while by default on POSIX systems pytest will continue to \
execute the tests after a test has timed, out this is not always \
possible.  Often the only sure way to interrupt a hanging test is by \
terminating the entire process.  As this is a hard termination \
(``os._exit()``) it will result in no teardown, JUnit XML output etc. \
But the plugin will ensure you will have the debugging output on \
stderr nevertheless, which is the most important part at this stage."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pytest-timeout-2.1.0-2.3.noarch.rpm"
RPM_HASH = "a5722510dd443e24a72f62bd8f2a2d8e4da2bc922adfa882848539a4ff84e5c90a936d92313b265a40be90f84d2984a011a45483699c027d9a2c6462f44dd337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-timeout \
python310-pytest-timeout \
python3dist-pytest-timeout"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
