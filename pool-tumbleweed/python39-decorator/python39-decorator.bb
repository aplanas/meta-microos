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

RPM_NAME = "python39-decorator-5.1.1-2.2.noarch.rpm"
RPM_HASH = "1e97fbe639657a3d204f28131be750d41ab4f872a60584ca6f824a3fb7c1110279a720c751d3f6ea0392f238f11919b4565460b1554587d6720d07edd07490db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-decorator \
python39-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
