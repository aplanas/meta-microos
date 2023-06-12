SUMMARY = "A dead-simple, yet extensible, C and C++ unit testing framework"
DESCRIPTION = "Criterion follows the KISS principle, while keeping the control the user would have with other frameworks: \
* C99 and C++11 compatible. \
* Tests are automatically registered when declared. \
* Implements a xUnit framework structure. \
* A default entry point is provided, no need to declare a main unless you want to do special handling. \
* Test are isolated in their own process, crashes and signals can be reported and tested. \
* Unified interface between C and C++: include the criterion header and it just works. \
* Supports parameterized tests and theories. \
* Progress and statistics can be followed in real time with report hooks. \
* TAP output format can be enabled with an option. \
* Runs on Linux, FreeBSD, macOS, and Windows (Compiling with MinGW GCC and Visual Studio 2015+)."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "criterion-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "360d9f3c261b22411fb9a6accd10b5f718cf24e7ee994b525ba013dfa1be56b1803e9b33252897aedba0ce7c8cd79dcc6aa6b797aab6206dd582f424bc191416"

RPROVIDES:${PN} += "criterion \
criterion(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
