SUMMARY = "Streaming protocol for test results"
DESCRIPTION = "Subunit is a streaming protocol for test results.  The protocol is a \
binary encoding that is generated and parsed.  By design, all the \
components of the protocol conceptually fit into the xUnit TestCase -> \
TestResult interaction. \
 \
Subunit comes with command line filters to process a subunit stream and \
language bindings for Python, C, C++ and Shell. Bindings can be \
written for other languages. \
 \
A number of useful things can be done easily with subunit: \
- Test aggregation: Tests run separately can be combined and then \
  reported/displayed together.  For instance, tests from different \
  languages can be shown as a seamless whole. \
- Test archiving: A test run may be recorded and replayed later. \
- Test isolation: Tests that may crash or otherwise interact badly with \
  each other can be run separately and then aggregated, rather than \
  interfering with each other. \
- Grid testing: subunit can act as the necessary serialization and \
  deserialization to get test runs on distributed machines to be \
  reported in real time."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-python-subunit-1.4.2-3.1.noarch.rpm"
RPM_HASH = "039c3b4eb22d0f6ba3797e8dee064d0700de5dbf4ad6630011b46e4576d3044d4d82156d7e4bef13fce2ccd4cf15851c80057a07ead14ac9b6d206fb9057ef51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-subunit \
python310-python-subunit \
python3dist-python-subunit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python310-extras \
python310-testtools"

inherit rpm
