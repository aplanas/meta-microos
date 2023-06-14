SUMMARY = "Distributed testing and loop-on-failing for py.test"
DESCRIPTION = "The `pytest-xdist`_ plugin extends py.test with some unique \
test execution modes: \
 \
* test run parallelization_: if you have multiple CPUs or hosts you can use \
  those for a combined test run.  This allows to speed up \
  development or to use special resources of `remote machines`_. \
 \
* ``--boxed``: (not available on Windows) run each test in a boxed_ \
  subprocess to survive ``SEGFAULTS`` or otherwise dying processes \
 \
* ``--looponfail``: run your tests repeatedly in a subprocess.  After each run \
  py.test waits until a file in your project changes and then re-runs \
  the previously failing tests.  This is repeated until all tests pass \
  after which again a full run is performed. \
 \
* `Multi-Platform`_ coverage: you can specify different Python interpreters \
  or different platforms and run tests in parallel on all of them. \
 \
Before running tests remotely, ``py.test`` efficiently 'rsyncs' your \
program source code to the remote place.  All test results \
are reported back and displayed to your local terminal. \
You may specify different Python versions and interpreters."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python310-pytest-xdist-3.3.1-1.1.noarch.rpm"
RPM_HASH = "8a10dea129decf9911f85c064db7d4966660311cdcaff0f4f4abb9a52b2dd5ae3e76b015ba5ff1297b77af94ee91c78208d256ec7e1ef0b1a795c23cb264dbee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xdist \
python3.10dist-pytest-xdist \
python310-pytest-xdist \
python3dist-pytest-xdist"

RDEPENDS:${PN} += "python-abi \
python310-execnet \
python310-pytest"

inherit rpm
