SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-deprecation-2.1.0-2.14.noarch.rpm"
RPM_HASH = "5ca699d6ea06d84c9ffb3a29ca9e951839cebe8c4a92ef6aa41672ca3082ec96babfd71b8485cc9de20ed88d113fc968f21fbf5221fa36bf4355d062e8dee6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-deprecation \
python39-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
