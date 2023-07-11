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

RPM_NAME = "python311-colorama-0.4.6-2.3.noarch.rpm"
RPM_HASH = "301f502894569a0781a37c8e57663f9c3bbe7180469c0ac4757f74e219bdf66e87eb8f7acb16ab29844708941b9ec338b2451649741957556c8313203f98168f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorama \
python3.11dist-colorama \
python311-colorama \
python3dist-colorama"

RDEPENDS:${PN} += "python-abi"

inherit rpm
