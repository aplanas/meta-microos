SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python39-pprintpp-0.4.0-6.4.noarch.rpm"
RPM_HASH = "0e1940d5a5132f34b663d9f94a08359c139661a041cee483e7992730fcd7cb53bf8ffe69528ac2c3c2cb7cec13ebd06064c3755b83f50b6346510e62c8d09ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pprintpp \
python39-pprintpp \
python3dist-pprintpp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
