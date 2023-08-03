SUMMARY = "Documentation for python-flup"
DESCRIPTION = "This package contains HTML documentation for python-flup."
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python-flup-doc-1.0.3.dev20161029-4.1.noarch.rpm"
RPM_HASH = "7ee7704a22920154b6f8fdee2a2477bf09990bbdc281073d83d7757ff7f97065d8e174ec944da81bdf3f3396efcf8ea6eea7822e224d79b170f8f2ce9b4819e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flup-doc \
python310-flup-doc \
python311-flup-doc \
python39-flup-doc"

RDEPENDS:${PN} += ""

inherit rpm
