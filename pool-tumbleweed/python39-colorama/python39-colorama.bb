SUMMARY = "Cross-platform colored terminal text"
DESCRIPTION = "Makes ANSI escape character sequences, for producing colored terminal text and \
cursor positioning, work under MS Windows. \
 \
ANSI escape character sequences have long been used to produce colored terminal \
text and cursor positioning on Unix and Macs. Colorama makes this work on \
Windows, too. It also provides some shortcuts to help generate ANSI sequences, \
and works fine in conjunction with any other ANSI sequence generation library, \
such as Termcolor. \
 \
This has the upshot of providing a simple cross-platform API for printing \
colored terminal text from Python, and has the happy side-effect that existing \
applications or libraries which use ANSI sequences to produce colored output on \
Linux or Macs can now also work on Windows, simply by calling colorama.init()."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "python39-colorama-0.4.6-2.1.noarch.rpm"
RPM_HASH = "8e5a064f47c31b5d42b4694c30415c32d4182001ef7107e2dff5b3751a0cc68dcd05d6b3dc0b706e2bd801e3b850b3c6d51d3b70744d3d63067f2942c8098214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorama \
python39-colorama \
python3dist-colorama"

RDEPENDS:${PN} += "python-abi"

inherit rpm
