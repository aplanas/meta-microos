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

RPM_NAME = "python311-decorator-5.1.1-2.2.noarch.rpm"
RPM_HASH = "8fe77767efcf7e2f652de620f062374a7dc0f7c7b05dac0ec2e6756411d04ecc29dda768252a99bdc49810c7b8e2411c8c19b7dc0b16fe2c884ca7812ba91e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-decorator \
python3.11dist-decorator \
python311-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
