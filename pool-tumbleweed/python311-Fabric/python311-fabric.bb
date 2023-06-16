SUMMARY = "A Pythonic tool for remote execution and deployment"
DESCRIPTION = "Fabric is a Python library and command-line tool for \
streamlining the use of SSH for application deployment or systems \
administration tasks. \
 \
It provides a basic suite of operations for executing local or remote shell \
commands (normally or via sudo) and uploading/downloading files, as well as \
auxiliary functionality such as prompting the running user for input, or \
aborting execution. \
 \
In addition to being used via the fab tool, Fabric's components may be imported \
into other Python code, providing a Pythonic interface to the SSH protocol \
suite at a higher level than that provided by e.g. Paramiko (which \
Fabric itself leverages)."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python311-Fabric-2.7.1-3.4.noarch.rpm"
RPM_HASH = "d4078cdd8024267bb2649aa715587f9ade99ca97dc6806da90290b30b003087d3b840168dec3a2672aac95c27f67d98b77864efefce3c2721591affa75f3ecd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fabric \
python311-Fabric \
python311-Fabric2 \
python311-Fabric3 \
python311-fabric \
python311-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
python311-decorator \
python311-invoke \
python311-paramiko \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
