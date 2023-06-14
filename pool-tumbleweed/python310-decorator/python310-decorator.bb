SUMMARY = "Decorators for Humans"
DESCRIPTION = "Typical implementations of Python decorators involve nested \
functions, and do not preserve the signature of decorated functions, \
thus can be confusing to both developers and documentation tools. \
 \
This module changes the usage of decorators for the average \
programmer so as to make decorators such as memoize, tracing, \
redirecting_stdout, locked, etc. more accessible."
LICENSE = "BSD-2-Clause"

PV = "5.1.1"

RPM_NAME = "python310-decorator-5.1.1-2.1.noarch.rpm"
RPM_HASH = "43cef0e030399d8d0bbcf30de1af9c64f3ff32cce8fe209da4b4eab4577ba8f4665ab65c739ff7f8b9ba8edbba4cea3b1eaa39faa6ce4f9218c4563492010bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-decorator \
python3.10dist-decorator \
python310-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
