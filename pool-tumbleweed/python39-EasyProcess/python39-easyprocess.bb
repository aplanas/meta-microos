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

RPM_NAME = "python39-EasyProcess-1.1-2.3.noarch.rpm"
RPM_HASH = "bfaa1014b630c8f29bcbb8f0026053b9e2868a18a011e580cd6481c3fb1abb97f1191c6f97e70b4213d4a167d3cf43b7b2337af51015ffe5bd558507d681e994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easyprocess \
python39-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
