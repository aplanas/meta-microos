SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-deprecation-2.1.0-2.12.noarch.rpm"
RPM_HASH = "5b704272edd62cab9e8ce42968b9837f0b82c5527783223657f60533b3ba90084f146900d81a68cf1e4303e1b58c931ce4c54051cf2becf0252739410bf3c0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-deprecation \
python39-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
