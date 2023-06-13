SUMMARY = "Unit-testing framework for all .NET languages"
DESCRIPTION = "NUnit is a unit testing framework for all .NET languages. It serves the \
same purpose as JUnit does in the Java world. It supports test \
categories, testing for exceptions and writing test results in plain \
text or XML."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "nunit3-3.7.1-1.7.noarch.rpm"
RPM_HASH = "504d973a2ea1beec52b5f0eadec946f17643cbc8c2b298c858d9b21ab93183ce68614b3ea849b1b6729cd6ecb61a520a1d6b516fcf4a7eff63e54ddb807328e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(mock-assembly) \
mono(nunit.framework) \
mono(nunit.framework.tests) \
mono(nunit.testdata) \
mono(nunitlite) \
mono(nunitlite-runner) \
mono(nunitlite.tests) \
mono(slow-nunit-tests) \
nunit3"

RDEPENDS:${PN} += "/bin/sh \
mono(System) \
mono(System.Core) \
mono(System.Web) \
mono(System.Windows.Forms) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
