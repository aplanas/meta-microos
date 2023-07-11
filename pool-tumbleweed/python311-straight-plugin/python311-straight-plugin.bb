SUMMARY = "Python plugin loader"
DESCRIPTION = "straight.plugin is a Python plugin loader inspired by twisted.plugin with two \
important distinctions: \
 \
 - Fewer dependencies \
 - Python 3 compatible \
 \
The system is used to allow multiple Python packages to provide plugins within \
a namespace package, where other packages will locate and utilize. The plugins \
themselves are modules in a namespace package where the namespace identifies \
the plugins in it for some particular purpose or intent."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-straight-plugin-1.5.0-2.13.noarch.rpm"
RPM_HASH = "135d8731ac0bf5d777d476ad6f5bdf43d64120df572ad48d3e202f69503c85c534b66f7c803f6f618dcfe2d9afabebf57b8a63b4061729e7b78226408e8f18f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-straight-plugin \
python3.11dist-straight.plugin \
python311-straight-plugin \
python3dist-straight.plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
