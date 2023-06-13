SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python310-Deprecated-1.2.14-1.1.noarch.rpm"
RPM_HASH = "994de72ca6b9ba110b71c54740b4366a54ed4eff0e5f53a04aeddaf1448e3bebbbb933ccda51089e13a44a00cd01421ca816d55c04922bf34837cf7ead01160d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Deprecated \
python3-deprecated \
python3.10dist(deprecated) \
python310-Deprecated \
python310-deprecated \
python3dist(deprecated)"

RDEPENDS:${PN} += "python(abi) \
python310-wrapt"

inherit rpm
