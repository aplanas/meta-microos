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

RPM_NAME = "python310-python-subunit-1.4.2-2.2.noarch.rpm"
RPM_HASH = "cb514a49050cb45840129437f6bafc2082659e3c48f2627270674e5bc8bc3b781b49b9e7c9d066dd66981b5292b51aba40daf819ec648283fd87cd3b36fc3851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-subunit \
python3.10dist(python-subunit) \
python310-python-subunit \
python3dist(python-subunit)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python310-extras \
python310-testtools"

inherit rpm
