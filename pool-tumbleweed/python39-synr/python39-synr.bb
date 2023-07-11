SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python39-synr-0.6.0-1.8.noarch.rpm"
RPM_HASH = "4f48b03e60114c389b6164ef5a49e0075d7a23b71bee5cb431645470b20e5c7277ffcbe3323f0b4e0bd06904a8dfc3f4ace6c58c9845057a4930acb7ac892d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-synr \
python39-synr \
python3dist-synr"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
