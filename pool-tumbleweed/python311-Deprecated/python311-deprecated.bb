SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python311-Deprecated-1.2.14-1.3.noarch.rpm"
RPM_HASH = "a03c969f20dbb3488b79a3d9e587b071c1ccecbf4135bb8c0c361f6c6ffaeac569942fa47b125086e6d50baaf3a9d5ad95f6530d33c544387b23e4e238315bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Deprecated \
python3-deprecated \
python3.11dist-deprecated \
python311-Deprecated \
python311-deprecated \
python3dist-deprecated"

RDEPENDS:${PN} += "python-abi \
python311-wrapt"

inherit rpm
