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

RPM_NAME = "python310-colorama-0.4.6-2.1.noarch.rpm"
RPM_HASH = "a55aa463e8502d9a1e2da5f7f6847390af6e1dcc63e492320764c64a140a43d8043a2d0da4992f616e84648f1ad335c27fee124535369be4546a5ab85eacc0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorama \
python3.10dist-colorama \
python310-colorama \
python3dist-colorama"

RDEPENDS:${PN} += "python-abi"

inherit rpm
