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

RPM_NAME = "python310-EasyProcess-1.1-3.3.noarch.rpm"
RPM_HASH = "a46118065ca51c023b290b9edfae7f27fb218e58dcc82012fff7903136d10c9e188dd17b351772eb172e0c08c7927516fbed73d11001bc24eb2eb9cbbb33a376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easyprocess \
python310-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
