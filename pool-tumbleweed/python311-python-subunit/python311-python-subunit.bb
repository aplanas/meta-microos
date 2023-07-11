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

RPM_NAME = "python311-python-subunit-1.4.2-2.4.noarch.rpm"
RPM_HASH = "77c19d9e5b8c7d7c62febdfea88d4dbbd887ac8a28b3e3175071fcc3c2316117c6ba3df059b7b3c0274eea79c5065d4f1b2faa8be1cc8e211dbe38f5a5d69efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-subunit \
python3.11dist-python-subunit \
python311-python-subunit \
python3dist-python-subunit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python311-extras \
python311-testtools"

inherit rpm
