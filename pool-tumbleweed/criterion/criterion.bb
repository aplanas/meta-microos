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

PV = "2.4.2"

RPM_NAME = "criterion-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "b27c1be0d33e7d8ce53be9f6af53dd70472b9b98d6769312deb8dd50a54e96d2fd99240ad1101a4ca201149b6b06f310228c3fc137cf18b40e53743b523067f9"

RPROVIDES:${PN} += "criterion"

RDEPENDS:${PN} += ""

inherit rpm
