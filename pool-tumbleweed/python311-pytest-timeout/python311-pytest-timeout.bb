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

RPM_NAME = "python311-pytest-timeout-2.1.0-2.3.noarch.rpm"
RPM_HASH = "cbf84982f39ef37834687809a5a6258145c83377c79fcdb7505d417d5e08710a1c43ef4e2691f6eb961d3200a19ddb4e9a78fc46aa7683da7336896e97c7601b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-timeout \
python3.11dist-pytest-timeout \
python311-pytest-timeout \
python3dist-pytest-timeout"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
