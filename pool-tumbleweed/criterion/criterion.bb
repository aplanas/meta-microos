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

RPM_NAME = "criterion-2.4.2-1.2.aarch64.rpm"
RPM_HASH = "d068bf6d3220c4bd173c237a62190c730d3a325b119c9d08c05bbd089f9f0e8e19e939e28f7808eab2a77136b9743096ee5f3e978b4221eb75d27c32d786236c"

RPROVIDES:${PN} += "criterion"

RDEPENDS:${PN} += ""

inherit rpm
