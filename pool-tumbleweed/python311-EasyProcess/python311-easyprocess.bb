SUMMARY = "Python subprocess interface"
DESCRIPTION = "EasyProcess is a Python subprocess interface. \
 \
Features include: \
 - layer on top of subprocess module \
 - starting and stopping of programs \
 - retrieval of standard output/error, return code of programs \
 - command can be list or string \
 - logging \
 - timeout \
 - unit-tests \
 - cross-platform, development on linux \
 - global config file with program aliases \
 - unicode support \
 - supported python versions: 2.5, 2.6, 2.7, 3.1, 3.2, PyPy \
 \
Limitations: \
 - shell is not supported \
 - pipes are not supported \
 - stdout/stderr is set only after the subprocess has finished \
 - stop() does not kill whole subprocess tree"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python311-EasyProcess-1.1-3.3.noarch.rpm"
RPM_HASH = "2bb582c2c77fa4f1dbd6f198f601630a2bf199b4a5da5309fa756fb6dde1918b6fdd91626e0bf9dda1beaabca8c1ff6b3f973df98bbec3881f291889f39cefc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EasyProcess \
python3.11dist-easyprocess \
python311-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
