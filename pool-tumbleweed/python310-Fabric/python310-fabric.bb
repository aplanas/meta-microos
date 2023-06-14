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

RPM_NAME = "python310-Fabric-2.7.1-3.4.noarch.rpm"
RPM_HASH = "6857f95677f2334f919009c9870d0175c72de8237490a4842e833944daface743877c096fdec1ae34f4f54cf1d5386a71b6bae97fe9e26c50017006be4c35dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Fabric \
python3-Fabric2 \
python3-Fabric3 \
python3-fabric \
python3-fabric2 \
python3.10dist-fabric \
python310-Fabric \
python310-Fabric2 \
python310-Fabric3 \
python310-fabric \
python310-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-cryptography \
python310-decorator \
python310-invoke \
python310-paramiko \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
