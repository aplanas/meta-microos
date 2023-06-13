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

RPM_NAME = "python39-decorator-5.1.1-2.1.noarch.rpm"
RPM_HASH = "b880a05ddcd69c43b192eba339e89d934b77f456bd2351efdbbf58dcf48fbc0263c05e1921db356811927a49acdf8dfdff822a8db65b77657eee091c0b1e1e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(decorator) \
python39-decorator \
python3dist(decorator)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
