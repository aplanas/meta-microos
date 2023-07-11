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

RPM_NAME = "python39-EasyProcess-1.1-3.3.noarch.rpm"
RPM_HASH = "4441c39576d28361b806adb21223ad3a0c348a41f770f065b91e2dbb44de36a73266c2c0fbf7e8ecd81cd8916e47bbdbb49a703aea84c605f3d25539ebc7100e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easyprocess \
python39-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
