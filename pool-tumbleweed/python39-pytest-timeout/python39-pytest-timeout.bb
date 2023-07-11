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

RPM_NAME = "python39-pytest-timeout-2.1.0-2.3.noarch.rpm"
RPM_HASH = "3f2e6e5d316e3ff51a9dc3613a47497797d70b52d06dfd47e0a2408ff0ef144da4c09d160d4394350ff2795fe45fd6b804f567fd22b4c863f6a6e5752e458d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-timeout \
python39-pytest-timeout \
python3dist-pytest-timeout"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
