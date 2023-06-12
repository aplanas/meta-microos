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

RPM_NAME = "python311-decorator-5.1.1-2.1.noarch.rpm"
RPM_HASH = "de0e1da15f1220c7c9d8bab11e3cb148cfa9d77e02c467fe2c7dcc4b0da6475d80ae17bae739fc8493813c97e9696e2e550355ba2cbbf1ec6365ac4e2776bf39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(decorator) \
python311-decorator \
python3dist(decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
