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

RPM_NAME = "python39-colorama-0.4.6-2.3.noarch.rpm"
RPM_HASH = "3a1edcb4d67f47d336b2f3d8e3d3f0f97fc850de6ea86c9605f836e58e6e2b11fed61a1b581df99f38dff0181b5c0ccd89a3cf5e3d8a99e2e17813653b7f5fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorama \
python39-colorama \
python3dist-colorama"

RDEPENDS:${PN} += "python-abi"

inherit rpm
