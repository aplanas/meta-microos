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

RPM_NAME = "python311-colorama-0.4.6-2.1.noarch.rpm"
RPM_HASH = "6f8f680efa2545ee6f412fed944f70cc4bf78037919e3310ced14a5ccb13b01ea017f6a82d821be22c0af692283d6ee756a5e9605ecf854cc0c1ffa5357c0ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colorama) \
python311-colorama \
python3dist(colorama)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
