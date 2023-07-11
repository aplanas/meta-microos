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

RPM_NAME = "python310-decorator-5.1.1-2.2.noarch.rpm"
RPM_HASH = "6aa0b3999a06621822fdd5a27bbb95f22de2ebe46d565ba8bb76ea594cd2178816cff5d5bd105a2110e147fba09c83bf49fa74bb4e11d9c5eab81af6bfe3dc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-decorator \
python310-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
